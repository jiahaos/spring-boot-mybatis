package com.jh.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiahao on 2016/11/14.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({
        "com.jh"})
@MapperScan({
        "com.jh.mybatis"
})
public class Application implements CommandLineRunner {

    public void run(String... args) throws Exception {
    }

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
    }

}
