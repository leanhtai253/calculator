package com.leanhtai.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private static final double PI = 3.14;
    public int sum(int a, int b) {
        return a + b;
    }
}
