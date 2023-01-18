package com.spring_apache.Apache_Kafka.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.spring_apache.Apache_Kafka.config.KafkaTopicConfig;

import ch.qos.logback.classic.Logger;
/**
 * KafkaProducer
 */

@Service
public class KafkaProducer {
    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(KafkaTopicConfig.class);

    private static final String TOPIC = "my_first_topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info(String.format("#### -> Producing message -> %s", message));
        System.out.println("Producing message: " + message);
        this.kafkaTemplate.send(TOPIC, message);
    }

}