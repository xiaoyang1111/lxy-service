package com.lxy.service.lxy.entity.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class OrderResult {

    @ApiModelProperty(name="userId",value = "用户id")
    private String userId;

    @ApiModelProperty(name="orderNum",value = "订单号")
    private String orderNum;

    @ApiModelProperty(name="userName",value = "用户名")
    private String userName;

    @ApiModelProperty(name="addressDetail",value = "用户详细地址")
    private String addressDetail;

    @ApiModelProperty(name="phone",value = "用户手机号")
    private String phone;

    @ApiModelProperty(name="workType",value = "工作类型")
    private Integer workType;

    @ApiModelProperty(name="orderStatus",value = "订单状态")
    private Integer orderStatus;

    @ApiModelProperty(name="createTime",value = "创建时间即下单时间")
    private Date createTime;

    @ApiModelProperty(name="id",value = "表id")
    private String  id ;
}
