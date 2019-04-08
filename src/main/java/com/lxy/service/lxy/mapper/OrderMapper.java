package com.lxy.service.lxy.mapper;

import com.lxy.service.lxy.entity.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lixinyang
 * @Date
 * @Version
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    public Order getOrderByUserId(Order order);
}
