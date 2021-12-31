package com.javaConfig.config;


import com.javaConfig.model.Student;
import com.javaConfig.model.User;
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

    @Bean
    public User getUser()
    {
        return new User();
    }

}
