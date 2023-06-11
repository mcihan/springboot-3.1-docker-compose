package com.cihan.springbootdockercompose;

import com.cihan.springbootdockercompose.model.Order;
import com.cihan.springbootdockercompose.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(OrderRepository repository) {
        return args -> repository.save(new Order(1, "computer", "It is new computer order"));
    }
}
