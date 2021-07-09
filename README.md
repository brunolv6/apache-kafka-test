# apache-kafka-test
Testing consumer and productor of Apach Kafka in Spring

#subir zookeper port 2181
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

#subir kafka port 9092
.\bin\windows\kafka-server-start.bat .\config\server.properties

#criar topic cats
.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3 --topic cats

#caso queira gerar um consumer na linha de comando
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 1 --topic cats --from-beginning

#caso queira gerar um produtor na linha de comando (na forma JSON)
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic cats --property "parse.key=true" --property "key.separator=:"
> 2:{"id": 2, "name": "Mela", "age": 5}


