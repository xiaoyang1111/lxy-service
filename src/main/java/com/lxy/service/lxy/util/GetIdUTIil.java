package com.lxy.service.lxy.util;

import java.util.Random;
import java.util.UUID;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
public class GetIdUTIil {

    /**
     * id生成规则
     * @return
     */
    public static String getId(){
      return  UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 订单号生成规则
     * @return
     */
    public static String getOrderNum(){
        StringBuffer buffer = new StringBuffer();
        String orderNum =  DateUtils.getCurrentTimeStrDefault();
        buffer.append(orderNum);
        Random random = new Random();
        int number = random.nextInt(8999);
        buffer.append(number+1000);
        return  buffer.toString();
    }
}
