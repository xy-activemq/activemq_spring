package com.xywei.activemq.queuetest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProducerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        Producer producer = (Producer) classPathXmlApplicationContext.getBean("producer");
        producer.sendMessage();
    }

}
