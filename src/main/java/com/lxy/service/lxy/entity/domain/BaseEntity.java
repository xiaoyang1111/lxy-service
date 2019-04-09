package com.lxy.service.lxy.entity.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lxy.service.lxy.util.GetIdUTIil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lixinyang
 * @Date
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class BaseEntity<T> implements Serializable {

    @ApiModelProperty(name="id",value = "表id")
    private String id;

    @ApiModelProperty(name="isDel",value = "是否删除")
    private Integer isDel;

    @ApiModelProperty(name="page",value = "分页对象")
    private Page<T> page;

    @ApiModelProperty(name="createTime",value = "创建时间")
    private Date createTime;

    @ApiModelProperty(name="updateTime",value = "修改时间")
    private Date updateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * 修改方法
     */
    public void  updatePrint(){
        this.updateTime = new Date();
    }

    /**
     * 新增方法
     */
    public  void insertPrint(){
        this.id = GetIdUTIil.getId();
        this.createTime = new Date();
        this.updateTime =this.createTime;
    }

    /**
     * 删除标记（0：正常；1：删除）
     */
    public static final Integer IS_DEL_NORMAL = 0;
    public static final Integer IS_DEL_DELETE= 1;
}
