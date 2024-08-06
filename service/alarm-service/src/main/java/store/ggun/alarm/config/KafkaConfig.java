package store.ggun.alarm.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import reactor.kafka.receiver.ReceiverOptions;
import reactor.kafka.sender.SenderOptions;
import store.ggun.alarm.domain.model.ChatModel;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {


    @Bean
    public ReactiveKafkaProducerTemplate<String, ChatModel> reactiveKafkaProducerTemplate(KafkaProperties kafkaProperties) {
        return new ReactiveKafkaProducerTemplate<>(
                SenderOptions.<String, ChatModel>create(kafkaProperties.buildProducerProperties(null))
        );
    }

    @Bean
    public ReactiveKafkaConsumerTemplate<String, ChatModel> reactiveKafkaConsumerTemplate(KafkaProperties kafkaProperties) {
        return new ReactiveKafkaConsumerTemplate<>(
                ReceiverOptions.<String, ChatModel>create(kafkaProperties.buildConsumerProperties(null))
        );
    }

    @Bean
    public NewTopic adviceTopic() {
        return TopicBuilder.name("advice")
                .partitions(10)
                .replicas(1)
                .build();
    }
}