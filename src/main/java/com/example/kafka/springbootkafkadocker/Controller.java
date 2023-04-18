package com.example.kafka.springbootkafkadocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private final Producer producer;

    public Controller(Producer producer) {
        this.producer = producer;
    }


//    public Controller(Producer producer) {
//        this.producer = producer;
//    }

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }
}
