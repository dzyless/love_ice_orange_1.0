package com.love.ice.orange.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 6480036385859846942L;

    private Integer id;
    private String nickName;
    private String name;
    private String sex;
    private Integer telephone;
    private Date birthday;
    private String IDcard;
    private String address;
    private String addUser;
    private String addTime;
    private String updateUser;
    private String updateTime;

}
