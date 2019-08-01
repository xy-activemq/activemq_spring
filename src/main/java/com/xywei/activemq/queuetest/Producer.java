package com.xywei.activemq.queuetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage() {

        for (int i = 0; i < 3; i++) {
            jmsTemplate.send((session -> {
                TextMessage textMessage = session.createTextMessage("active 整合spring test");
                return textMessage;
            }));
        }

    }

}
