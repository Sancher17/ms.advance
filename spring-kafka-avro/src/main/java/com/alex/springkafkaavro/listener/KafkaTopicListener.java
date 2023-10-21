package com.alex.springkafkaavro.listener;

import com.alex.springkafkaavro.model.Employee;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@NoArgsConstructor
public class KafkaTopicListener {

    @Value("${topic.name}")
    private String topic;

    @KafkaListener(groupId = "group-1", topics = "${topic.name}")
    public void listener(Employee employee) {
        log.info("Topic {}. group-1. Received message in topic 1: {}", topic, employee);
    }

    @KafkaListener(groupId = "group-2",topics = "${topic.name}")
    public void listener2(Employee employee) {
        log.info("Topic {}. group-2. Received message in topic 2: {}", topic, employee);
    }

}