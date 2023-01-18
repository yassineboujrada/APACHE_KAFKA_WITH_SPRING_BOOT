package com.spring_apache.Apache_Kafka.controller;

import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_apache.Apache_Kafka.kafka.JsonKafkaProducer;
import com.spring_apache.Apache_Kafka.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMsgController {
    private JsonKafkaProducer json_producer;

    public JsonMsgController(JsonKafkaProducer kafkaProducer) {
        this.json_producer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        this.json_producer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
