package lesson_04_Java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for solving tasks on arrays
 */
public class ArrayHomeworkClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Create an array of integers. Write a program that displays a message saying whether the given number is
           in the array or not. Let the search number be specified from the console (Scanner class).
         */

        int[] array1 = new int[5]; // Create array of 5 elements

        // Fill array of 5 elements from 0 to 10
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) ((Math.random() * 11));
        }

        // Asking the user for a number
        System.out.print("Please enter a number to check if it is in the array: ");
        int inputNumber1 = sc.nextInt();

        Arrays.sort(array1); // Sorting the array since binarySearch() only works with a sorted array

        String outputMessageFirstTask; // Create a variable to display a message to the console

        // Checking through binary search whether there is a given number in the array.
        // If it is, then the result will be a number greater or equal 0.
        // And if the number is not in the array, then the result will be a negative number.
        if (Arrays.binarySearch(array1, inputNumber1) >= 0) {
            outputMessageFirstTask = "The entered number " + inputNumber1 + " is INCLUDED in the array " + Arrays.toString(array1);
        } else {
            outputMessageFirstTask = "The entered number " + inputNumber1 + " is NOT in the array " + Arrays.toString(array1);
        }
        System.out.println(outputMessageFirstTask);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        2. Create an array of integers. Remove all occurrences of the given number from the array.
           Let the number is set from the console (Scanner class). If there is no such number, print a message about it.
         */

        int[] array2 = new int[10]; // Create empty array of 10 elements
        int counter = 0;
        boolean isInArray = false; // Variable shows that entered variable not found in array

        // Fill array of 10 elements from 0 to 10
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * 11));
        }

        // Requesting a number from the user to be deleted
        System.out.print("Please enter the number to be removed from the array: ");
        int deleteElement = sc.nextInt();

        // A counter is created to find out the number of occurrences of the desired number in the array
        for (int el : array2) {
            if (el == deleteElement) {
                isInArray = true;
                counter += 1;
            }
        }

        String outputMessageSecondTask; // Create a variable to display a message to the console

        if (!isInArray) {
            outputMessageSecondTask = "The required element is not in this array! \n" +
                    "Source array: " + Arrays.toString(array2) + ". Length: " + array2.length;
        } else {
            // Create an array less than the first by the number of elements to be removed
            int[] newArray = new int[array2.length - counter];

            // If the array element is not equal to the one being removed, then add it to the new array
            for (int i = 0, j = 0; i < array2.length; i++) {
                if (array2[i] != deleteElement) {
                    newArray[j++] = array2[i];
                }
            }

            outputMessageSecondTask = "Source array: " + Arrays.toString(array2) + ". " + "Length: " + array2.length + "\n" +
                    "Element to be deleted: " + deleteElement + "\n" +
                    "New array after removing required number: " + Arrays.toString(newArray) + ". " + "Length: " + newArray.length;
        }

        System.out.println(outputMessageSecondTask);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        3. Create and fill an array with random numbers and output the minimum maximum and average value.
           To generate a random number, use the method Math.random(). Let it be possible to create an array
           of arbitrary size. Let the size of the array is entered from the console.
         */

        // Asking a user for a length of array
        System.out.print("Please input the length of array: ");
        int inputArrayLength = sc.nextInt();

        int[] array3 = new int[inputArrayLength]; // Create an array with a length specified by the user

        // Fill array with a length specified by the user from 0 to 100
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) ((Math.random() * 90) + 11);
        }

        int max = array3[0]; // Set the first value of the array as the maximum value
        int min = array3[0]; // Set the first value of the array as the minimum value
        int sumOfArray3 = 0; // Variable to calculate the sum if array elements

        // Iterate over each element in an array
        for (int i = 1; i < array3.length; i++) {
            // Check if an array element is greater than a given number, then assign the value as the maximum
            if (array3[i] > max) {
                max = array3[i];
            }
            // Check if an array element is less than a given number, then assign the value as the minimum
            if (array3[i] < min) {
                min = array3[i];
            }
            sumOfArray3 += array3[i]; // Calculate the sum of array elements
        }

        // Output information
        System.out.println("Source array: " + Arrays.toString(array3) + ". " + "Length: " + inputArrayLength + "\n" +
                "Maximum value: " + max + "\n" +
                "Minimum value: " + min);
        System.out.printf("Average value: %.2f", ((float) sumOfArray3 / array3.length));

        // Line to separate tasks
        System.out.println("\n---------------------------------------------------------------\n");

        /*
        4. Create 2 arrays of 5 numbers. Print the arrays to the console on two separate lines.
           Calculate the arithmetic mean of the elements of each array and tell for which from the arrays,
           this value turned out to be greater (or report that their averages arithmetic are equal).
         */
        int[] array41 = new int[5]; // create first empty array of 5 elements
        int[] array42 = new int[5]; // create second empty array of 5 elements
        int sumOfArray41 = 0;
        int sumOfArray42 = 0;

        // Fill a first and a second arrays of 5 elements from 0 to 10.
        // The first array is filled with elements "i", the second array is filled with elements "j"
        // According to the condition of the task, arrays of the same length, therefore, one condition is set in the cycle
        for (int i = 0, j = 0; i < array41.length; i++, j++) {
            array41[i] = (int) ((Math.random() * 11));
            array42[j] = (int) ((Math.random() * 11));
            sumOfArray41 += array41[i]; // Calculate the sum of the elements of the first array
            sumOfArray42 += array42[j]; // Calculate the sum of the elements of the second array
        }

        // Output for the first and second arrays
        System.out.println("First array: " + Arrays.toString(array41) + "\n" + "Second array: " + Arrays.toString(array42));

        // Calculate the average for the first and second arrays
        double averageOfArray41 = ((float) sumOfArray41) / array41.length;
        double averageOfArray42 = ((float) sumOfArray42) / array42.length;

        String outputMessageFourthTask; // Creating a variable to display a message to the console

        // Check which average is greater and display a message
        if (averageOfArray41 > averageOfArray42) {
            outputMessageFourthTask = String.format("The average of THE FIRST array (%.1f) is greater " +
                    "than the average of THE SECOND array (%.1f)", averageOfArray41, averageOfArray42);
        } else if (averageOfArray42 > averageOfArray41) {
            outputMessageFourthTask = String.format("The average of THE SECOND array (%.1f) is greater " +
                    "than the average of THE FIRST array (%.1f)", averageOfArray42, averageOfArray41);
        } else {
            outputMessageFourthTask = "The average is the same";
        }

        System.out.println(outputMessageFourthTask);

    }
}
