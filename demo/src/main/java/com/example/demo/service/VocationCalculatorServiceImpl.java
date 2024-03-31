package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Сервис для расчёта отпускых
 * salary-средняя зарплата за месяц
 * WORKING_DAYS_IN_MONTH - рабочие дни в году
 * vacationDaysCount- отпускные
 */
@Service
public class VocationCalculatorServiceImpl implements VacationCalculatorService {


    public static  int salary ;
    private static final int WORKING_DAYS_IN_MONTH = 22;
    private static int vacationDaysCount;

 @Override
    public int calculateAverageSalary(int vacationDaysCount, int workingDaysInMonth, int salary) {
        int salaryOneDay = salary / WORKING_DAYS_IN_MONTH;
        int vacationSalary = salaryOneDay * vacationDaysCount;
        return vacationSalary;
    }



}