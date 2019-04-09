package com.lxy.service.lxy.controller;

import com.lxy.service.lxy.entity.domain.BaseResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Slf4j
public abstract class BaseController {

    /**
     * 获取当前用户id
     * @return
     */
    public String getUserId(){
        return null;
    }

    /**
     * 返回对象
     * @return
     */
    public <T> BaseResult<T> getBaseResult(T content,Integer code,Boolean success,String message){
        BaseResult<T> baseResult = new BaseResult<T>();
        baseResult.setCode(code);
        baseResult.setContent(content);
        baseResult.setMessage(message);
        baseResult.setSuccess(success);
        return baseResult;
    }

    /**
     * 返回成功对象
     * @param content
     * @param message
     * @param <T>
     * @return
     */
    public <T> BaseResult<T> getBaseResultSuccess(T content,String message){
        return getBaseResult(content,200,true,message);
    }

    /**
     * 返回失败对象
     * @param content
     * @param message
     * @param <T>
     * @return
     */
    public <T> BaseResult<T> getBaseResultFail(T content,String message){
        return getBaseResult(content,200,false,message);
    }


}
