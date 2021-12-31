package com.javaConfig.config;


import com.javaConfig.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.javaConfig.config.JavaConfig")
public class JavaConfig
{
    @Bean
    public Student getStudent()
    {
        return new Student();
    }
}
