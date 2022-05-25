package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class SpringEnshu1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringEnshu1Application.class, args);

        ProductService userService = context.getBean(ProductService.class);
        List<Product> list = userService.findAll();
        System.out.println("[Products]");
        for (Product u : list) {
            System.out.println(u.getProductInfo());
        }
    }

}

