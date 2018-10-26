package com.love.ice.orange.dao;

import com.love.ice.orange.entity.UserInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.love.ice.orange.dao")
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
    @Ignore
    public void queryById() {
    }

    @Test
    @Ignore
    public void insertUserInfo() {
    }

    @Test
    @Ignore
    public void updateUserInfo() {
    }

    @Test
    @Ignore
    public void deleteUserInfo() {
    }
}