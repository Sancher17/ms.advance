package com.alex.springkafkaavro.config.serialization;

import com.alex.springkafkaavro.model.Employee;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroMessageSerializer implements Serializer<Employee> {

//    public byte[] serialize(String topic, Employee data) {
//        // Adding schema version/id to the message
//        GenericRecord messageWithSchemaVersion = new GenericData.Record(data.getSchema());
////        messageWithSchemaVersion.put("schemaVersion", "v1"); // Replace with your schema version/id
////        messageWithSchemaVersion.put("payload", data);
//
//        // Serialization
//        DatumWriter<GenericRecord> datumWriter = new SpecificDatumWriter<>(data.getSchema());
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        Encoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
//        try {
//            datumWriter.write(messageWithSchemaVersion, encoder);
//            encoder.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return outputStream.toByteArray();
//    }

    @Override
    public byte[] serialize(String topic, Employee data) {

        byte[] arr = new byte[100000];
        try {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
                GenericDatumWriter<Employee> writer = new GenericDatumWriter<>(data.getSchema());
                writer.write(data, binaryEncoder);
                binaryEncoder.flush();
                arr = outputStream.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
