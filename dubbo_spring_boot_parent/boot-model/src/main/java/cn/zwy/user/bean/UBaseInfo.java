package cn.zwy.user.bean;

import cn.zwy.bean.BaseEntity;
import cn.zwy.pay.bean.PUserAmount;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户-基础信息
 * </p>
 *
 * @author mrzhaowy
 * @since 2020-10-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("u_base_info")
@ApiModel(value="UBaseInfo对象", description="用户-基础信息")
public class UBaseInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("id")
    private Long id;

    @ApiModelProperty(value = "姓名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "手机")
    @TableField("mobile")
    private String mobile;

    @TableField(exist = false)
    private PUserAmount userAmount;
}
