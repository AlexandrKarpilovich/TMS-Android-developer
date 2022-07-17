package lesson_03_Java;

import java.util.Scanner;

/**
 * Class for solving tasks on cycles
 */
public class CycleClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Use a for loop to display odd numbers from 1 to 99. (use increment)
         */
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        2. Use a for loop to display numbers from 15 to 1. (use decrement)
         */
        for (int i = 15; i >= 1; i--) {
            System.out.println(i);
        }

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        3. Write a program where the user enters any positive integer - N.
           Program sums all numbers from 1 to N. To enter a number, use the Scanner class.
         */
        System.out.print("Input any positive number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        4. Write a program that will display the following sequence on the screen:
           7 14 21 28 35 42 49 56 63 70 77 84 91 98. Use the while loop in the solution
         */
        int counter = 1;
        byte multiplierSeven = 7;
        byte result = 0;
        String resultLineForTask4 = "";

        while (counter < 15) {
            result = (byte) (counter * multiplierSeven);
            resultLineForTask4 += result + " "; // Add result and space to the string
            counter++;
        }

        // Delete last char from string resultLineForTask4
        String substringTask4 = resultLineForTask4.substring(0, resultLineForTask4.length() - 1);
        System.out.println(substringTask4);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        5. Output the first 10 numbers of the sequence 0, -5, -10, -15...
         */
        byte multiplierFive = -5;
        int output = 0;
        String resultLineForTask5 = "";

        for (int i = 0; i <= 10; i++) {
            output = multiplierFive * i;
            resultLineForTask5 += output + ", ";
        }

        // Delete two last chars from string resultLineForTask4
        String substringTask5 = resultLineForTask5.substring(0, resultLineForTask5.length() - 2);
        System.out.println(substringTask5);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        6. Write a program that displays the squares of numbers from 10 to 20 inclusive
         */
        String resultLineForTask6 = "";
        short squareNumber = 0;

        for (int i = 10; i <= 20; i++) {
            // Use class Math and method pow(). Also can use ** operator
            squareNumber = (short) Math.pow(i, 2);
            resultLineForTask6 += squareNumber + ", ";
        }

        // Delete two last chars from string resultLineForTask4
        String substringTask6 = resultLineForTask6.substring(0, resultLineForTask6.length() - 2);
        System.out.println(substringTask6);

    }
}
