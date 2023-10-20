package com.alex.springkafkaavro.rest;

import com.alex.springkafkaavro.KafkaProducerService;
import com.alex.springkafkaavro.model.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.header.internals.RecordHeader;
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

    private final KafkaProducerService producerService;

    @Value("${topic.name}")
    private String topic;

    @PostMapping
    public String sentMessage(@RequestBody Employee employee) {
        producerService.sendMessageWithHeaders(topic, employee,
                "schema-version", "v1");
        return "Message sent into topic: " + topic;
    }
}
