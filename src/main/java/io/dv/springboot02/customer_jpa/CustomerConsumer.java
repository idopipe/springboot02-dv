package io.dv.springboot02.customer_jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.dv.springboot02.custom_def.command_line_runner.CommandLineRunner_2;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class CustomerConsumer {
    @Bean
    public CommandLineRunner_2 consumCustomerRepo(CustomerRepository custRepo) {
        return args -> {
            custRepo.save(Customer.builder().firstName("Jack").lastName("Bauer").build());
            custRepo.save(Customer.builder().firstName("Chloe").lastName("O'Brian").build());
            custRepo.save(Customer.builder().firstName("Kim").lastName("Bauer").build());
            custRepo.save(Customer.builder().firstName("David").lastName("Palmer").build());
            custRepo.save(Customer.builder().firstName("Michelle").lastName("Dessler").build());

            log.info("Customers found with findAll()");
            log.info("-------------------------------");
            custRepo.findAll().forEach(c -> log.info(c.toString()));
            log.info("");

            Customer customer = custRepo.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            custRepo.findByLastName("Bauer").forEach(bauer -> log.info(bauer.toString()));
            log.info("");
        };
    }
}