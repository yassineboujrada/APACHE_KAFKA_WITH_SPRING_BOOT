package com.spring_apache.Apache_Kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_apache.Apache_Kafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class msgController {
    private KafkaProducer producer;

    public msgController(KafkaProducer producer) {
        this.producer = producer;
    }
    
    //http:locathost:8080/api/kofka/publish?message=hetto world
    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return ResponseEntity.ok("Published successfully");
    }
}
