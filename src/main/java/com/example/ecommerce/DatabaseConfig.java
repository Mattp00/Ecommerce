package com.example.ecommerce;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Ordine;
import com.example.repository.OrdineRepository;

@Configuration
@EntityScan(basePackageClasses = Ordine.class)
@EnableJpaRepositories(basePackageClasses = OrdineRepository.class)
public class DatabaseConfig {
    
}