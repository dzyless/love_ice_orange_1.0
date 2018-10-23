package com.love.ice.orange.dao;

import com.love.ice.orange.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void listUserInfo() {
        List<UserInfo> list = userInfoMapper.listUserInfo();
        for(UserInfo info : list){
            System.out.println(info.toString());
        }
    }

    @Test
    public void queryById() {
    }

    @Test
    public void insertUserInfo() {
    }

    @Test
    public void updateUserInfo() {
    }

    @Test
    public void deleteUserInfo() {
    }
}