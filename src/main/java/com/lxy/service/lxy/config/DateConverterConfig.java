package com.lxy.service.lxy.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 日期解析配置
 * 解决request body和feign中无法绑定定制化日期格式的问题
 * @author wuwentao
 * @date 2019/1/17
 */
@Configuration
public class DateConverterConfig {
    @Bean
    public DateJacksonConverter dateJacksonConverter() {
        return new DateJacksonConverter();
    }

    @Bean
    public Jackson2ObjectMapperFactoryBean jackson2ObjectMapperFactoryBean(@Autowired DateJacksonConverter dateJacksonConverter) {
        Jackson2ObjectMapperFactoryBean jackson2ObjectMapperFactoryBean = new Jackson2ObjectMapperFactoryBean();
        jackson2ObjectMapperFactoryBean.setDeserializers(dateJacksonConverter);
        return jackson2ObjectMapperFactoryBean;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(@Autowired ObjectMapper objectMapper) {
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        //设置日期格式
        SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(smt);
        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
        //设置中文编码格式
        List<MediaType> list = new ArrayList<>();
        list.add(MediaType.APPLICATION_JSON_UTF8);
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
        return mappingJackson2HttpMessageConverter;
    }

    class DateJacksonConverter extends JsonDeserializer<Date> {
        @Override
        public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return DateUtils.parseDate(p.getText());
        }

        @Override
        public Class<?> handledType() {
            return Date.class;
        }
    }
}
