package com.microservices.project.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Data
public class TwitterToKafkaServiceConfigData {

    @Value("${twitter.keywords}")
    List<String> twitterKeywords;

    @Value("${welcome.message}")
    String welcomeMessage;


}
