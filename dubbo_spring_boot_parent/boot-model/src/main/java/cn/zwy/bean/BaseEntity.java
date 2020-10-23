package cn.zwy.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午6:27
 **/
@Data
public class BaseEntity implements Serializable {

    @ApiModelProperty(value = "创建人Id")
    @TableField(value = "create_user_id", fill = FieldFill.INSERT)
    private String createUserId;

    @ApiModelProperty(value = "创建人")
    @TableField(value = "create_user_name", fill = FieldFill.INSERT)
    private String createUserName;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "修改人Id")
    @TableField(value = "update_user_id", fill = FieldFill.INSERT_UPDATE)
    private String updateUserId;

    @ApiModelProperty(value = "修改人姓名")
    @TableField(value = "update_user_name", fill = FieldFill.INSERT_UPDATE)
    private String updateUserName;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除状态")
    @TableField(value = "status", fill = FieldFill.INSERT)
    @TableLogic
    private Integer status;
}
