package cn.zwy.pay.bean;

import java.math.BigDecimal;

import cn.zwy.bean.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mrzhaowy
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("p_user_amount")
@ApiModel(value="PUserAmount对象", description="")
public class PUserAmount extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("id")
    private Long id;

    @TableField("user_id")
    private Long userId;

    @TableField("amount")
    private BigDecimal amount;

    @TableField("status")
    private Integer status;


}
