package com.spring_apache.Apache_Kafka.kafka;

import org.apache.kafka.common.protocol.Message;
import org.slf4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.spring_apache.Apache_Kafka.config.KafkaTopicConfig;
import com.spring_apache.Apache_Kafka.payload.User;

@Service
public class JsonKafkaProducer {
    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(KafkaTopicConfig.class);

    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User msg_data) {
        log.info(String.format("#### -> Producing message -> %s", msg_data.toString()));
        
        kafkaTemplate.send(MessageBuilder.withPayload(msg_data).setHeader(KafkaHeaders.TOPIC,"first_json_topic").build());
    }
}
