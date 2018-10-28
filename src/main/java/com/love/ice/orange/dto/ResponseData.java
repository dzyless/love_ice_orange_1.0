package com.love.ice.orange.dto;

import com.love.ice.orange.enums.ResponseCodes;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhyu.d
 * @description
 * @date 2018/10/24 15:50
 */

@Data
public class ResponseData<T> implements Serializable {

    private static final long serialVersionUID = -7525641406182829492L;

    private Integer code;
    private String message;
    private T data;

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功（系统定义的成功消息CODE和成功消息MESSAGE）
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createSuccess(){
        return new ResponseData<T>(ResponseCodes.SUCCESS.getCode(), ResponseCodes.SUCCESS.getMessage());
    }

    /**
     * 成功（系统定义的成功消息CODE和成功消息MESSAGE）
     * @param data 自定义的返回数据
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createSuccessData(T data){
        return new ResponseData<T>(ResponseCodes.SUCCESS.getCode(), ResponseCodes.SUCCESS.getMessage(), data);
    }

    /**
     * 失败（系统定义的失败消息CODE和失败消息MESSAGE）
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createError(){
        return new ResponseData<T>(ResponseCodes.ERROR.getCode(), ResponseCodes.ERROR.getMessage());
    }

    /**
     * 失败（系统定义的失败消息CODE和失败消息MESSAGE）
     * @param data 自定义的返回数据
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createErrorData(T data){
        return new ResponseData<T>(ResponseCodes.ERROR.getCode(), ResponseCodes.ERROR.getMessage(), data);
    }

    /**
     * 自定义返回
     * @param code 自定义的消息CODE
     * @param message 自定义的消息MESSAGE
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createDIYMessage(Integer code, String message){
        return new ResponseData<T>(code, message);
    }

    /**
     * 自定义创回结果
     * @param code 自定义的消息CODE
     * @param message 自定义的消息MESSAGE
     * @param data 自定义的返回数据
     * @param <T>
     * @return
     */
    public static <T> ResponseData<T> createDIYData(Integer code, String message, T data){
        return new ResponseData<T>(code, message, data);
    }

}
