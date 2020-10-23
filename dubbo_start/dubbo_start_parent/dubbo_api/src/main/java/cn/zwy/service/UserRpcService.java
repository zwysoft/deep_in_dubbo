package cn.zwy.service;


import cn.zwy.bean.User;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:27
 **/
public interface UserRpcService {

    User selectById(String id);
}
