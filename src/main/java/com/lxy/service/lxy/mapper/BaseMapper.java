package com.lxy.service.lxy.mapper;

/**
 * @author lixinyang
 * @Date
 * @Version
 */
public interface BaseMapper<T> {

    /**
     * 根据id获取单条数据
     * @param id
     * @return
     */
    public  T get(String id);

    /**
     * 根据参数删除数据
     * @param t
     * @return
     */
    public void delete(T t);

    /**
     * 新增数据
     * @param t
     * @return
     */
    public void  insert(T t);

    /**
     * 修改数据
     * @param t
     * @return
     */
    public void update(T t);
}
