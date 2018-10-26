package com.love.ice.orange.service;

import com.github.pagehelper.PageInfo;
import com.love.ice.orange.entity.UserInfo;

import java.util.HashMap;
import java.util.List;

public interface UserInfoService {

    List<UserInfo> listUserInfo();
    PageInfo<UserInfo> pageListUserinfo(HashMap<String, Object> map);
    UserInfo queryById(Integer id);
    int insertUserInfo(UserInfo userInfo);
    int updateUserInfo(UserInfo userInfo);
    int deleteUserInfo(Integer id);

}
