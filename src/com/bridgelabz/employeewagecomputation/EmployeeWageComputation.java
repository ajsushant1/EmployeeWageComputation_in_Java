package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    //CONSTANTS
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO EMPLOYEE WAGE COMPUTATION /**************************/");

        //VARIABLES
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        //COMPUTING EMPLOYEE WAGE
        for (int day = 1; day <= NUMBER_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage for day "+day+ " is :" + empWage);
            totalEmpWage += empWage;
        }
        //DISPLAYING TOTAL EMPLOYEE WAGE FOR A MONTH
        System.out.println("Total Employee Wage for a month is :" + totalEmpWage);
    }
}
