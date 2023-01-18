package com.spring_apache.Apache_Kafka.kafka;

import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring_apache.Apache_Kafka.config.KafkaTopicConfig;
import com.spring_apache.Apache_Kafka.payload.User;

@Service
public class JsonKafkaConsumer {
    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(KafkaTopicConfig.class);

    @KafkaListener(topics = "first_json_topic", groupId = "myGroup")
    public void consume(User message) {
        log.info(String.format("#### -> Consumed message -> %s", message.toString()));
        System.out.println("Consumed message: " + message.toString());
    }
}
