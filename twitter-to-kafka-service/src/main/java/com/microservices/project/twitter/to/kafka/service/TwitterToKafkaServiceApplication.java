package com.microservices.project.twitter.to.kafka.service;

import com.microservices.project.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData) {
        this.twitterToKafkaServiceConfigData = twitterToKafkaServiceConfigData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App starts...");
        LOG.info(twitterToKafkaServiceConfigData.getTwitterKeywords().toString());
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());

    }
}
