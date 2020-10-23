package cn.zwy.service.impl;

import cn.zwy.bean.User;
import cn.zwy.service.UserRpcService;

import java.util.UUID;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:28
 **/
public class UserServiceImpl implements UserRpcService {
    public User selectById(String id) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("李四");
        user.setPhone("15995795528");
        return user;
    }
}
