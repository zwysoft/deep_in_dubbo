package cn.zwy.service.impl;

import cn.zwy.bean.Meeting;
import cn.zwy.bean.User;
import cn.zwy.service.MeetingService;
import cn.zwy.service.UserRpcService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:33
 **/
@Service
public class MeetingServiceImpl implements MeetingService {

    @Reference
    private UserRpcService userRpcService;

    public Meeting selectByCode(String code) {
        Meeting meeting = new Meeting();
        meeting.setCode(code);
        meeting.setContent("内容");
        meeting.setId(UUID.randomUUID().toString());
        meeting.setTitle("learn dubbo");
        User user = userRpcService.selectById(String.valueOf(1));
        meeting.setUser(user);
        return meeting;
    }
}
