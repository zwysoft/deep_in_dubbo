package cn.zwy.service;

import cn.zwy.bean.Meeting;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:32
 **/
public interface MeetingService {

    Meeting selectByCode(String code);
}
