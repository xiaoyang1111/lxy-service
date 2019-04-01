package com.lxy.service.lxy.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("teatApi")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiModelProperty("测试")
    @GetMapping("/test/{test}")
    public String test(@PathVariable String test){
        return test;
    }

}
