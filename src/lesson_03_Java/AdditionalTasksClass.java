package lesson_03_Java;

import java.util.Scanner;

/**
 * Class for solving additional tasks
 */
public class AdditionalTasksClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Display the first 11 terms of the Fibonacci sequence
         */
        int number1 = 0;
        int number2 = 1;
        int sumNumber = 0;
        String resultString = "";

        resultString += number1 + " " + number2 + " "; // Add to the result string first and second numbers

        for (int i = 2; i < 12; i++) {
            sumNumber = number1 + number2; // Calculate sum
            resultString += sumNumber + " "; // Add to result string
            number1 = number2; // Assigning the value of the second number to the first number
            number2 = sumNumber; // Assigning the value of the sum of the first and second numbers to the second number
        }

        // Delete last char from string resultLineForTask4
        String substringFibonacciNumbers = resultString.substring(0, resultString.length() - 1);
        System.out.println(substringFibonacciNumbers);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        2. For each month, the bank accrues 7% of the amount to the deposit amount.
           Write a program that the user enters the deposit amount and the number of months.
           And the bank calculates the final amount of the deposit taking into account the accrual of interest in
           each month. To calculate an amount including interest use a for loop
         */
        System.out.print("Please enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        System.out.print("Please enter number of month: ");
        short numberOfMonth = sc.nextShort();
        float percent = 0.07f;
        double resultSumDeposit = depositAmount;

        for (int i = 1; i <= numberOfMonth; i++) {
            resultSumDeposit += depositAmount * percent;
            depositAmount = resultSumDeposit;
        }

        // Format result to two decimal places
        String formatResult = String.format("%.2f", resultSumDeposit);

        System.out.println(formatResult);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        3.1. Write a program that prints the multiplication table to the console
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        3.2. Write a program that prints the multiplication table to the console.
             The program prompts the user for a number and a range for which to calculate.
         */
        System.out.print("Please enter the number: ");
        int number = sc.nextInt();
        System.out.print("Please enter the range: ");
        int range = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= range; i++) {
            result = number * i;
            System.out.printf("%d * %d = %d \n", number, i, result);
        }
    }
}
