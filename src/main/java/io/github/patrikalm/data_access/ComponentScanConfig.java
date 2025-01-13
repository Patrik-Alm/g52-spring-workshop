package io.github.patrikalm.data_access;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "io.github.patrikalm")
public class ComponentScanConfig {

    @Bean
    public Scanner scanner() {

     return new Scanner(System.in);

    }
}
