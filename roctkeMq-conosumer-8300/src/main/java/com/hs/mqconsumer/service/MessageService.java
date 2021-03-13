package com.hs.mqconsumer.service;

import com.hs.entity.MqOrder;
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
@RocketMQMessageListener(consumerGroup = "hs-mq-order-provider",topic = "hs-order-topic")
public class MessageService implements RocketMQListener<MqOrder> {

    @Override
    public void onMessage(MqOrder mqOrder) {
        System.out.println("我是消费者，下面是我收到的数据");
        System.out.println(mqOrder);
    }

}
