package com.lxy.service.lxy.api;

import com.lxy.service.lxy.entity.HostType;
import com.lxy.service.lxy.util.CommonUtil;
import com.lxy.service.lxy.util.HttpUtil;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URLEncoder;

@Service
public class ALiYunSmsApi {

    private static final String UTF8 = "UTF-8";
    private static final String PATH = "user";

    private HostType apiHostType = new HostType("http://api.cn.ronghub.com");
    private HostType smsHostType = new HostType("http://api.sms.ronghub.com");


    public  HostType getApiHostType() {
        return apiHostType;
    }

    public void setApiHostType(HostType apiHostType) {
        this.apiHostType = apiHostType;
    }

    public HostType getSmsHostType() {
        return smsHostType;
    }

    public void setSmsHostType(HostType smsHostType) {
        this.smsHostType = smsHostType;
    }

    /**
     * 学员获取融云token
     * @param
     * @return
     * @throws Exception
     */
    public String getToken(String userId,String username,String portraitUri) throws Exception {
        String appKey="8luwapkv8bt3l";
        String appSecret="sHUoLNnRDsyXPG";

        StringBuilder sb = new StringBuilder();
        sb.append("&userId=").append(URLEncoder.encode(userId, UTF8));
        sb.append("&name=").append(URLEncoder.encode(username, UTF8));
        sb.append("&portraitUri=").append(URLEncoder.encode(portraitUri, UTF8));
        String body = sb.toString();
        if (body.indexOf("&") == 0) {
            body = body.substring(1, body.length());
        }
        HttpURLConnection conn = HttpUtil.CreatePostHttpConnection(getApiHostType(), appKey, appSecret, "/user/getToken.json", "application/x-www-form-urlencoded");
        HttpUtil.setBodyParameter(body, conn);
        return CommonUtil.getResponseByCode(PATH,"register",HttpUtil.returnResult(conn));
        //return (String) GsonUtil.fromJson(CommonUtil.getResponseByCode(PATH,"register",HttpUtil.returnResult(conn)), String.class);
    }


    public static void  main(String agrs[]){

        try {
           /* System.err.println(ronghubTokenUtil.getToken("20190222"));*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
