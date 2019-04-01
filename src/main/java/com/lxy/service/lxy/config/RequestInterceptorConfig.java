package com.lxy.service.lxy.config;

import org.springframework.context.annotation.Configuration;

/**
 * feign 调用将 jwtToken 传过去
 *
 * @author wuwentao
 * @date 2019/1/25
 */
@Configuration
public class RequestInterceptorConfig  {

/*    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (null != attributes) {
            HttpServletRequest request = attributes.getRequest();
            template.header("jwtToken", request.getHeader("jwtToken"));
        }
    }*/
}
