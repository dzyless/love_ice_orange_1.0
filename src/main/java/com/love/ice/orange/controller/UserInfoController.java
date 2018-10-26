package com.love.ice.orange.controller;

import com.github.pagehelper.PageInfo;
import com.love.ice.orange.dto.BaseMap;
import com.love.ice.orange.dto.ResponseData;
import com.love.ice.orange.entity.UserInfo;
import com.love.ice.orange.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userInfoController")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/pageListUserInfo")
    public ResponseData<PageInfo<UserInfo>> listUserinfo(@RequestBody BaseMap<String, Object> map){
        PageInfo<UserInfo> pageInfo = userInfoService.pageListUserinfo(map);
        return ResponseData.createSuccessData(pageInfo);
    }

}
