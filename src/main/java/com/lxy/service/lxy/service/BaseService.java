package com.lxy.service.lxy.service;

import com.lxy.service.lxy.entity.domain.BaseEntity;
import com.lxy.service.lxy.mapper.BaseMapper;
import com.lxy.service.lxy.util.GetIdUTIil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    /**
     * 新增或修改
     * @param d
     */
    public void save(D d){
        if(null ==d.getId()){
            d.insertPrint();
            d.setId(GetIdUTIil.getId());
            dao.insert(d);
        }else{
            d.updatePrint();
            dao.update(d);
        }
    }

    /**
     * 删除
     * @param d
     */
    public void delete(D d){
        d.setUpdateTime(new Date());
        dao.delete(d);
    }

}
