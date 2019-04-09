package com.lxy.service.lxy.controller;

import com.lxy.service.lxy.entity.domain.BaseResult;
import com.lxy.service.lxy.entity.domain.Order;
import com.lxy.service.lxy.entity.domain.OrderResult;
import com.lxy.service.lxy.entity.dto.OrderFromDto;
import com.lxy.service.lxy.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@RestController
@RequestMapping("/orderApi")
public class OrderController extends BaseController {
    @Autowired
    OrderService orderService;

    @ApiOperation("新增下单")
    @PostMapping("/order")
    public BaseResult<?> add(OrderFromDto orderFromDto){
        try{
            Order order = new Order();
            BeanUtils.copyProperties(orderFromDto,order);
            orderService.save(order);
            //发短信通知
            return getBaseResultSuccess(null,"下单成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  getBaseResultFail(null,"服务出错，请稍后再访问，谢谢");
    }

    @ApiOperation("获取个人订单列表")
    @GetMapping("/getList/{userId}")
    public BaseResult<List<OrderResult>> getList(@PathVariable String oppenId){
        try{
            List<OrderResult> list = orderService.getList(oppenId);
            return getBaseResultSuccess(list,"获取个人列表成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  getBaseResultFail(null,"服务出错，请稍后再访问，谢谢");
    }




}
