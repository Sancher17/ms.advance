package com.alex.springkafkaavro.config;

import com.alex.springkafkaavro.model.Employee;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Configuration
public class Consumer {

    private final KafkaProperties kafkaProperties;

    @Bean
    public Map<String, Object> consumerConfiguration() {
        Map<String, Object> properties = new HashMap<>(kafkaProperties.buildProducerProperties());
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        properties.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, "true");
        properties.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        return properties;
    }

    @Bean
    public ConsumerFactory<String, Employee> consumerFactory() {
        return new DefaultKafkaConsumerFactory <>(
                consumerConfiguration());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Employee> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Employee> containerFactory
                = new ConcurrentKafkaListenerContainerFactory<>();
        containerFactory.setConsumerFactory(consumerFactory());
        return containerFactory;
    }
}