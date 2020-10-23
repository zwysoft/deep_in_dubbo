package cn.zwy.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mrzhaowy
 * @create 2020-10-20 下午12:24
 **/
@Data
public class User implements Serializable {

    private String id;

    private String name;

    private String phone;
}
