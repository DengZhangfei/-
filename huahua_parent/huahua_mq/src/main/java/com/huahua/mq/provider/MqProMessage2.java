package com.huahua.mq.provider;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "qa")
//如果队列中有消息产生，则触发监听(消费者)
public class MqProMessage2 {

    /**
     * 功能描述：直接模式
     * @Author 邓张飞
     * @Date 20:20 2019/4/23
     * @Param [message]
     * @return void
     */
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("#.log 消费者 小二 回复："+message);
    }

}
