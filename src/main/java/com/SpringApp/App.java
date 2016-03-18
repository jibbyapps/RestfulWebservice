package com.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by vitaliiromanchenko on 18.03.16.
 */

@EnableAutoConfiguration
@ComponentScan("com.SpringApp")


public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);

    }
}
