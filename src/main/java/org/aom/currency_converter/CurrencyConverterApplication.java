package org.aom.currency_converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableConfigurationProperties(ApplicationProperties.class)
public class CurrencyConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}
}

