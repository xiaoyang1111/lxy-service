package com.lxy.service.lxy.controller;

import com.lxy.service.lxy.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinyang
 * @Description TODO
 * @Date 2019/3/29 0029
 * @Version
 */
@Api(description = "test")
@RestController
@RequestMapping("/testApi")
public class TestController {

    @Autowired
    RedisUtil redisUtil;

    @ApiOperation("测试")
    @GetMapping("/test/{test}")
    public String test(@PathVariable String test){
        redisUtil.set("test",test);
        String info  = (String) redisUtil.get("test");
        return info;
    }



}
