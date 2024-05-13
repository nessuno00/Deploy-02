package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

    @RestController
    public class BasicController {
        @Value("${default.port}")
        private String defaultport;
        @Value("${test.port}")
        private String testport;
        @Value("${prod.port}")
        private String prodport;
        @GetMapping("/randomSum")
        public int randomSum() {
            Random random = new Random();
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            return num1 + num2;
        }
    }


