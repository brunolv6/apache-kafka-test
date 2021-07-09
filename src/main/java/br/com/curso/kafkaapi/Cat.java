package br.com.curso.kafkaapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.MessageFormat;

class Cat {

    @JsonProperty
    int id;

    @JsonProperty
    String name;

    @JsonProperty
    int age;

    @JsonCreator
    Cat(@JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // precisou de um get aleatório para funcionar
    // na realidade: do get que é uma string e não um int
    // não necessário quando @JsonProperty encima dos atributos
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return MessageFormat.format("Cat [id={0}, name={1}, age={2}]", id, name, age);
    }
}
