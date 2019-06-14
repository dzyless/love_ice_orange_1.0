package com.love.ice.orange.rabbitmq;

import com.love.ice.orange.entity.Order;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhyu.d
 * @description
 * @date 2018/11/6 18:00
 */

@Component
public class GetMessage {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "test-queue", durable = "true"),
            exchange = @Exchange(value = "test-exchange", durable = "true", type = "topic"),
            key = "order.#"
    ))
    @RabbitHandler
    public void get(@Payload Order order, Channel channel, @Headers Map<String, Object> headders) throws Exception{
        System.out.println(order.getCreateTime());
        Long deliveryTag = (Long) headders.get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(deliveryTag, false);
    }

}
