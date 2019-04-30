package com.lxy.service.lxy.util;

import com.alibaba.fastjson.JSON;
import com.lxy.service.lxy.entity.domain.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
public class OderTest {

  public static void test(){
      List<Order> list = new ArrayList<>();
      for(int i=5;i>0;i--){
          Order order = new Order();
          order.setUserName("测试"+i);
          order.setOrderNum(""+i);
          order.setUserId("qwer"+i);
          order.setOrderNum("1");
          list.add(order);
      }
      list.add(null);
    /*  Optional.ofNullable(list).orElse(Collections.emptyList()).forEach(System.out::println);*/
     List<Order> list1 = list.stream().filter(Order ->null !=Order).collect(Collectors.toList());
     /* list1.stream().forEach(o ->{
          System.out.println(o.getUserName());
      });*/
    Map<String,Order> map = list.stream().filter(o-> o != null ).collect(Collectors.toMap(Order::getUserId,order -> order));
      System.out.println(JSON.toJSONString(map));
  /*    Collections.sort(list,Comparator.comparing(Order::getOrderNum));
      list.forEach(System.out::println);*/
  Integer reduce = Stream.of(1,1,2,3).reduce(5,(count,item)->{
      System.out.println(count);
      System.out.println(item);
      return count +item;
  });
      System.out.println(reduce);
  }
  public static void  main(String[] agrs){
      test();
  }
}
