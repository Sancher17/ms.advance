package com.alex.springkafkaavro.config.serialization;

import com.alex.springkafkaavro.model.Employee;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.kafka.common.serialization.Deserializer;

public class AvroMessageDeserializer implements Deserializer<Employee> {

    @Override
    public Employee deserialize(String topic, byte[] data) {
        try {
            if (data != null) {
                DatumReader<Employee> reader = new SpecificDatumReader<>(Employee.getClassSchema());
                Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
                Employee read = reader.read(null, decoder);
                return read;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
