package cn.zwy.bean;

import lombok.Data;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:31
 **/
@Data
public class Meeting {

    private String id;

    private String code;

    private String title;

    private String content;

    private User user;


}
