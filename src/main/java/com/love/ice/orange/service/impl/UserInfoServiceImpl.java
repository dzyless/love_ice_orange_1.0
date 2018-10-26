package com.love.ice.orange.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.love.ice.orange.dao.UserInfoMapper;
import com.love.ice.orange.entity.UserInfo;
import com.love.ice.orange.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> listUserInfo() {
        return userInfoMapper.listUserInfo();
    }

    @Override
    public PageInfo<UserInfo> pageListUserinfo(HashMap<String, Object> map) {
        int pageNum = Integer.valueOf(map.get("pageNum").toString());
        int pageSize = Integer.valueOf(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> list = userInfoMapper.listUserInfo();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public UserInfo queryById(Integer id) {
        return userInfoMapper.queryById(id);
    }

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertUserInfo(userInfo);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    @Override
    public int deleteUserInfo(Integer id) {
        return userInfoMapper.deleteUserInfo(id);
    }
}
