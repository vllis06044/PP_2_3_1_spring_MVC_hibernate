package ru.javamentor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("ru.javamentor")
@Import(DatabaseConfig.class)
@EnableTransactionManagement
public class AppConfig {
}