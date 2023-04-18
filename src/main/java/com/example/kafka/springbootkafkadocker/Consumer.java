package com.example.kafka.springbootkafkadocker;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "topic_1",groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println("Message received from Kafka : " + message);
    }
}
