package io.github.patrikalm.data_access;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.github.patrikalm")
public class ComponentScanConfig {

    @Bean
    public String scanner() {

        ScannerInputService scannerInputService = new ScannerInputService();
        return scannerInputService.toString();
    }
}
