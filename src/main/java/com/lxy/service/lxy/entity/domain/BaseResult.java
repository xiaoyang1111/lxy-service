package com.lxy.service.lxy.entity.domain;

import lombok.Data;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Data
public class BaseResult<T extends Object> {

    private Integer code;

    private String message;

    private T content;

    private Boolean success;

    public BaseResult(){
    }
    public BaseResult(T content){
        this.content = content;
        this.success=true;
    }
    public BaseResult(T content,Integer code){
        this.code=code;
        this.content = content;
        this.success=true;
    }
    public BaseResult(T content, Integer code,String message){
        this.message =message;
        this.content = content;
        this.success=true;
    }
    public BaseResult(T content, Integer code,String message,Boolean success){
        this.success =success;
        this.message =message;
        this.content = content;
        this.success=true;
    }

}
