package com.zwy;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午1:01
 **/
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}