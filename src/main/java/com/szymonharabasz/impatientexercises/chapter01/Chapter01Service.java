package com.szymonharabasz.impatientexercises.chapter01;

import org.springframework.stereotype.Component;

@Component
public class Chapter01Service {
    public String exercise01(int number) {
        var inverse = 1.0/number;
        return String.format("Binary: %s<br/>Octal %#o<br/>Hexadecimal: %<#x<br/>Hexadecimal of inverse: %a", Integer.toBinaryString(number), number, inverse);
    }

    public String exercise02(int number) {
        int operator = (number+360) % 360;
        int floor = Math.floorMod(number, 360);
        return String.format("With %% operator: %d<br/>With Map.floor(): %d", operator, floor);
    }
}
