package com.leanhtai.calculator.unit.service;

import com.leanhtai.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void sum() {
        assertEquals(15, calculatorService.sum(10, 5));
    }
}
