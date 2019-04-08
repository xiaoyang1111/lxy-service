package com.lxy.service.lxy.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class OrderQueryDto extends BaseQueryDTO {
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
}
