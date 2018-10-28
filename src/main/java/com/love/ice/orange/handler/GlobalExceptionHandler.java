package com.love.ice.orange.handler;

import com.love.ice.orange.enums.ResponseCodes;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhyu.d
 * @description 全局异常处理
 * @date 2018/10/28 15:59
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, Object> GlobalExceptionHandler(HttpServletRequest request, Exception e){
        Map<String, Object> map = new HashMap<>();
        map.put("code", ResponseCodes.ERROR.getCode());
        map.put("status", ResponseCodes.ERROR.getMessage());
        map.put("message", e.getMessage());
        return map;
    }
}
