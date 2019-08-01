package com.xywei.activemq.queuetest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Consumer consumer = (Consumer) applicationContext.getBean("consumer");
        consumer.receiveMessage();
    }

}
