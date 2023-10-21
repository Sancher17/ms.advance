package com.alex.springkafkaavro.rest;

import com.alex.springkafkaavro.model.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/kafka")
@RestController
public class KafkaController {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${topic.name}")
    private String topic;

    @PostMapping
    public String sentMessage(@RequestBody Employee employee) {
        kafkaTemplate.send(topic, employee);
        return "Message sent into topic: " + topic;
    }
}
