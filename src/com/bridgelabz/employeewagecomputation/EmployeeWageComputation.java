package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO EMPLOYEE WAGE COMPUTATION /**************************/");
        //CONSTANTS
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //VARIABLES
        int empHrs = 0;
        int empWage = 0;
        //GENERATING RANDOM VALUE
        double empCheck = Math.floor(Math.random() * 10) % 2;
        //COMPUTING EMPLOYEE WAGE
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage :" + empWage);
    }
}
