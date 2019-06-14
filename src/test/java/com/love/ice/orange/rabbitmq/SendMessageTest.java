package com.love.ice.orange.rabbitmq;

import com.love.ice.orange.entity.Order;
import com.love.ice.orange.utils.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMessageTest {

    @Autowired
    private SendMessage sendMessage;

    @Test
    public void send() {
        Order order = new Order();
        order.setCreateTime(DateUtils.format(new Date()));
        order.setPaymentTime(DateUtils.format(new Date()));
        sendMessage.send(order);

    }
}