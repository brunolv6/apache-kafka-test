package br.com.curso.kafkaapi;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CatConsumer {

    @KafkaListener(id = "my.cats", topics = "cats")
    void consumes(Cat cat) {
        System.out.println("cat = " + cat.toString());
    }
}
