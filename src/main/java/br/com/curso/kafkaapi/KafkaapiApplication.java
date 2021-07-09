package br.com.curso.kafkaapi;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@SpringBootApplication
public class KafkaapiApplication {

	private static final Logger log = LoggerFactory.getLogger(KafkaapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaapiApplication.class, args);
	}

}
