package com.spring_apache.Apache_Kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;



@Configuration
public class KafkaTopicConfig {    
    public static final String TOPIC_NAME = "my_first_topic";
    public static final String TOPIC_JSON_NAME = "first_json_topic";

    @Bean
    public NewTopic my_first_topic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }

    @Bean
    public NewTopic first_json_topic() {
        return TopicBuilder.name(TOPIC_JSON_NAME).build();
    }

    
}