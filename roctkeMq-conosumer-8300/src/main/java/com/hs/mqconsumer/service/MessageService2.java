package com.hs.mqconsumer.service;

import com.hs.entity.UserOrder;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/12/15:09
 * @Description:
 */

@Service
@RocketMQMessageListener(consumerGroup = "hs-order-provider",topic = "hs-topic")
public class MessageService2 implements RocketMQListener<UserOrder> {

    @Override
    public void onMessage(UserOrder userOrder) {
        System.out.println("我是消费者，下面是我收到的数据");
        System.out.println(userOrder);
    }

}