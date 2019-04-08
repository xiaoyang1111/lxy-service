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
public class BaseQueryDTO {

    @ApiModelProperty(name="pageNum",value = "页码")
    private Integer pageNum =1;

    @ApiModelProperty(name="pageSize",value = "页面大小")
    private Integer pageSize =10;
}
