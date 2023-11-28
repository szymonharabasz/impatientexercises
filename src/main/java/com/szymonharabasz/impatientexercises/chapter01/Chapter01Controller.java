package com.szymonharabasz.impatientexercises.chapter01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chapter01Controller {

    private Chapter01Service service;

    public Chapter01Controller(Chapter01Service service) {
        this.service = service;
    }

    @GetMapping("ch01ex01/{number}")
    public String exercise01(@PathVariable("number") int number) {
        return service.exercise01(number);
    }

    @GetMapping("ch01ex02/{number}")
    public String exercise02(@PathVariable("number") int number) {
        return service.exercise02(number);
    }
}