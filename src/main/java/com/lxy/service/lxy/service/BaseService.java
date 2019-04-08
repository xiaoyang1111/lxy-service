package com.lxy.service.lxy.service;

import com.lxy.service.lxy.entity.domain.BaseEntity;
import com.lxy.service.lxy.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Transactional(readOnly = true)
public class BaseService<D extends BaseEntity<D>,T extends BaseMapper<D>> {

    @Autowired
    T dao;

    /**
     * 获取单条数据
     * @param d
     * @return
     */
    public D get(D d){
        return dao.get(d.getId());
    }

}
