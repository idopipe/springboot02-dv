package io.dv.springboot02;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class GreetingConsumer{

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			log.info("=========>befor consurm local greeting api");
			log.info(restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class).toString());
			log.info("=========>after consurm local greeting api");
        };
    }
}