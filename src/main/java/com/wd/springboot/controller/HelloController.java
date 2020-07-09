package com.wd.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.*;

@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(String name){

        return "hello" + name;

    }

    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getDayOfWeek());
//        System.out.println(LocalDate.of(2020,7,6));
//        System.out.println(LocalTime.now());
//        System.out.println(LocalTime.of(12,16,42));
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime of = LocalDateTime.of(2020, Month.SEPTEMBER, 7, 20, 12, 10);
//        System.out.println(of);

//        BigDecimal

    }

}

