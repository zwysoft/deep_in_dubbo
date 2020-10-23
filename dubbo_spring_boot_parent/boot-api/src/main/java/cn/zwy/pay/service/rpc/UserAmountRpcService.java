package cn.zwy.pay.service.rpc;

import cn.zwy.pay.bean.PUserAmount;
import cn.zwy.user.bean.UBaseInfo;

import java.io.Serializable;

/**
 * @author mrzhaowy
 * @create 2020-10-22 下午8:12
 **/
public interface UserAmountRpcService {

    PUserAmount getByUserId(Serializable id);
}
