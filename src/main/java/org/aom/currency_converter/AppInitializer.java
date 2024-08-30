package org.aom.currency_converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppInitializer implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppInitializer.class);

    private final ApplicationProperties applicationProperties;

    @Value("${app.version}")
    private String appVersion;

    public AppInitializer(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("AppInitializer::run() - App version read from properties file using @Value: {}", appVersion);
        logger.info("AppInitializer::run() - App version read from properties file using ConfigurationProperty class: {}", applicationProperties.getVersion());
        logger.info("AppInitializer::run() - All app. properties using ConfigurationProperty class: {}", applicationProperties);
    }
}
