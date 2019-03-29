package com.lxy.service.lxy.controller;

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
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test/{test}")
    public String test(@PathVariable String test){
        return test;
    }

}
