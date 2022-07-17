package lesson_03_Java;

import java.util.Scanner;

/**
 * Class for solving tasks on control structures
 */
public class ConditionClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Write a program to display the time of year by month number.
           Should be two options: switch-case and if-else-if
         */
        System.out.print("Input month number: ");
        byte monthNumber = sc.nextByte();

        // Implementation of the program through the construction: if-else-if
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("You entered the wrong month number! " +
                    "Please enter a number from 1 to 12 inclusive");
        } else if (monthNumber <= 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber <= 5) {
            System.out.println("Spring");
        } else if (monthNumber <= 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }

        // Implementation of the program through the construction: switch-case
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("You entered the wrong month number! " +
                    "Please enter a number from 1 to 12 inclusive");
        }
        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        2. Write a program that will take a number than input (can be set explicitly in the code)
           and will display a message about the parity of the number.
         */
        System.out.print("Input any number: ");
        int number = sc.nextInt();
        System.out.println(number % 2 == 0 ? "even" : "odd");
        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        3. For the number (outdoor temperature) it turns out:
           - if t > 15, then output "Heat"
           - if t <= 15 and t > -5, then it turns out "Normal"
           - if t <= 5, then it will be "Cold"
         */
        System.out.print("Input temperature: ");
        byte temperature = sc.nextByte();

        if (temperature > 15) {
            System.out.println("Warm");
        } else if (temperature > -5) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        // Line to separate tasks
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        /*
        4. By the entered (can be set explicitly) number, determine the color of the rainbow
         */
        System.out.print("Enter a number to determine the color of the rainbow: ");
        byte rainbowNumber = sc.nextByte();

        switch (rainbowNumber) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Blue");
            case 6 -> System.out.println("Indigo");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("You entered the wrong number! " +
                    "Please enter a number from 1 to 7 inclusive.");
        }
    }
}
