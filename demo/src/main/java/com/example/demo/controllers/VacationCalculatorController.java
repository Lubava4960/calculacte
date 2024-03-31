package com.example.demo.controllers;

import com.example.demo.service.VocationCalculatorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Контроллер для расчёта суммы отпускных
 */

@RestController
@RequestMapping("/calculate")
public class VacationCalculatorController {

    private final VocationCalculatorServiceImpl calculatorService;
    private static final int WORKING_DAYS_IN_MONTH = 22;
    public VacationCalculatorController(VocationCalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }


    @Operation(
            summary = "возможно узнать сумму отпускных добавив среднюю зарплату за месяц и колличество отпускных дней ",
            tags = "Отпускные"
    )
    @GetMapping


    public ResponseEntity<String> calculateVacation(@RequestParam int vacationDaysCount, @RequestParam int salary) {
        int vacationSalary = calculatorService.calculateAverageSalary(vacationDaysCount, WORKING_DAYS_IN_MONTH, salary);

        return ResponseEntity.ok("Сумма отпускных: " + vacationSalary);
    }

}
