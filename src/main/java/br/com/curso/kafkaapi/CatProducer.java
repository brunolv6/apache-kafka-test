package br.com.curso.kafkaapi;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatProducer {

    final KafkaTemplate<Long, Cat> producer;

    public CatProducer(KafkaTemplate<Long, Cat> producer) {
        this.producer = producer;
    }

    @PostMapping("/cats")
    void cats(@RequestBody Cat cat) {
        producer.send("cats", cat);
    }
}
