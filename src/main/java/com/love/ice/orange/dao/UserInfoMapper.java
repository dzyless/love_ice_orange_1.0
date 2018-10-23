package com.love.ice.orange.dao;

import com.love.ice.orange.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {

    List<UserInfo> listUserInfo();
    UserInfo queryById(Integer id);
    int insertUserInfo(UserInfo userInfo);
    int updateUserInfo(UserInfo userInfo);
    int deleteUserInfo(Integer id);
}
