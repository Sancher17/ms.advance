package com.alex.springkafkaavro;

import com.alex.springkafkaavro.model.Employee;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessageWithHeaders(String topic, Employee message,
                                       String headerKey, String headerValue) {

        ProducerRecord<String, Object> record = new ProducerRecord<>(topic, message);
        record.headers().add(headerKey, headerValue.getBytes());
        kafkaTemplate.send(record);
    }
}
