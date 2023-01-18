package com.spring_apache.Apache_Kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;



/**
 * KafkaTopicConfig
 */
@Configuration
public class KafkaTopicConfig {
    
    
    public static final String TOPIC_NAME = "my_first_topic";
    // public static final String GROUP_ID = "group_id";

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(TOPIC_NAME)
                // .partitions(10)
                // .replicas(1)
                .build();
    }

    
}