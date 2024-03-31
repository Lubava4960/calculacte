package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocationCalculatorServiceImplTest {

    @Test
    public void testCalculateAverageSalary() {
        // Arrange
        int vacationDaysCount = 10;
        int workingDaysInMonth = 22;
        int salary = 3000;
        int expectedVacationSalary = 1360; // Ожидаемая сумма отпускных

        VocationCalculatorServiceImpl calculatorService = new VocationCalculatorServiceImpl();

        // Act
        int actualVacationSalary = calculatorService.calculateAverageSalary(vacationDaysCount, workingDaysInMonth, salary);

        // Assert
        assertEquals(expectedVacationSalary, actualVacationSalary);
    }
}



