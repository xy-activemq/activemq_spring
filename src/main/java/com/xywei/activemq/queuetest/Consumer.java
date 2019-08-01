package com.xywei.activemq.queuetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void receiveMessage() {

        String message = (String) jmsTemplate.receiveAndConvert();
        while (null != message) {
            System.out.println("message:" + message);
            message=(String) jmsTemplate.receiveAndConvert();
        }

    }

}
