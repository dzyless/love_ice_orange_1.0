package com.love.ice.orange.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhyu.d
 * @description
 * @date 2018/11/6 16:24
 */

@Data
public class Order implements Serializable {
    private static final long serialVersionUID = -8379088270687429189L;
    private String orderNumber;
    private String createTime; //创建时间
    private String paymentTime; //支付时间
    private String deliveryTime; //发货时间
    private String transactionTime; //交易完成时间
    private Buyer buyer; //买家
    private Seller seller; //卖家
    private ExpressInfo expressInfo; //快递信息

}
