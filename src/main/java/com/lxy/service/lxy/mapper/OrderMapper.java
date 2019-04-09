package com.lxy.service.lxy.mapper;

import com.lxy.service.lxy.entity.domain.Order;
import com.lxy.service.lxy.entity.domain.OrderResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lixinyang
 * @Date
 * @Version
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    public Order getOrderByUserId(Order order);

    //获取list
    List<OrderResult> getList(String userId);
}
