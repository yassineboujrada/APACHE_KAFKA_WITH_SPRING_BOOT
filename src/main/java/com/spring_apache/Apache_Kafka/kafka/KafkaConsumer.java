package com.spring_apache.Apache_Kafka.kafka;

import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring_apache.Apache_Kafka.config.KafkaTopicConfig;

@Service
public class KafkaConsumer {
    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(KafkaTopicConfig.class);

    @KafkaListener(topics = "my_first_topic", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("#### -> Consumed message -> %s", message));
        System.out.println("Consumed message: " + message);
    }
    
}
