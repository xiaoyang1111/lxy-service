package com.lxy.service.lxy.service;

import com.lxy.service.lxy.entity.domain.Order;
import com.lxy.service.lxy.entity.domain.OrderResult;
import com.lxy.service.lxy.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Service
public class OrderService extends BaseService<Order,OrderMapper> {

    /**
     * 获取个人订单列表
     * @author lixinyang
     * @Date 2019-05-09 18:05
     * @Version 1.0
     */
    public List<OrderResult> getList(String userId){
        return dao.getList(userId);
    }
}
