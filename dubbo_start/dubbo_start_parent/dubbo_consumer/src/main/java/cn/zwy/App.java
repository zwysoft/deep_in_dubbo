package cn.zwy;

import cn.zwy.bean.Meeting;
import cn.zwy.bean.User;
import cn.zwy.service.MeetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午1:11
 **/
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        MeetingService meetingService = (MeetingService) context.getBean(MeetingService.class);
        Meeting meeting = meetingService.selectByCode("meetingCode");
        System.out.println(meeting); // 显示调用结果
        System.in.read();
    }
}
