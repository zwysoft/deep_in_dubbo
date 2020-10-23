package cn.zwy.user.service.rpc;

import cn.zwy.user.bean.UBaseInfo;

import java.io.Serializable;

/**
 * @author mrzhaowy
 * @create 2020-10-22 下午8:12
 **/
public interface UserRpcService{

    UBaseInfo getById(Serializable id);
}
