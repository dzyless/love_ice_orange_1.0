package com.love.ice.orange.rabbitmq;

import com.love.ice.orange.entity.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author zhyu.d
 * @description
 * @date 2018/11/6 16:54
 */

@Component
public class SendMessage {

    private static final String EXCHANGE = "test-exchange";
    private static final String ROUTING_KEY = "test.1";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Order order){
        CorrelationData data = new CorrelationData();
        data.setId(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, order, data);
    }
}
