package lesson_04_Java;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalArrayClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Create an array of N-random integers and print it to the screen. Let the size of the array
           is set from the console and the size of the array can be greater than 5 and less than or equal to 10.
           If N is not satisfies the conditions - display a message. If the user entered the wrong N, then
           the program should ask the user to repeat the input. Create a second array of only even ones
           elements of the first array, if any, and display it on the screen.
         */

        // Asking a user for a length of array
        System.out.print("Please input the length of array from 5 to 10: ");
        int inputArrayLength; // Create an empty variable
        int counter = 0;
        boolean isInArray = false; // Variable shows that even number not found in array

        // Check if the correct length has been entered
        do {
            inputArrayLength = sc.nextInt();
            if ((inputArrayLength <= 5) || (inputArrayLength > 10)) {
                System.out.print("You entered an invalid array length. " +
                        "The length of the array must be greater than 5 and less than or equal 10. Try again: ");
            }
        } while ((inputArrayLength <= 5) || (inputArrayLength > 10));

        int[] array1 = new int[inputArrayLength]; // Create an array with the length entered by the user

        // Fill array with numbers from 0 to 10
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) ((Math.random() * 11));
        }
        System.out.println("Source array: " + Arrays.toString(array1) + ". " + "Length: " + array1.length);

        // Check if there are even numbers in the array and count their number
        for (int el : array1) {
            if (el % 2 == 0) {
                isInArray = true;
                counter += 1;
            }
        }

        if (!isInArray) {
            System.out.println("There are no even elements in this array.");
        } else {
            //Create a new array with a length equal to the number of even elements of the first array
            int[] newArray = new int[counter];

            // Fill a new array with even numbers
            for (int i = 0, j = 0; i < array1.length; i++) {
                if (array1[i] % 2 == 0) {
                    newArray[j++] = array1[i];
                }
            }

            System.out.println("New array with only even elements: " + Arrays.toString(newArray)
                    + ". Length: " + newArray.length);
        }

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        2. Create an array and populate it. Print the array to the screen as a string. Will replace each element with
           odd index to 0. Print the array again on a separate line.
         */

        int[] array2 = new int[10];

        // Fill array with numbers from 0 to 10
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * 11));
        }

        System.out.println("Source array: " + Arrays.toString(array2));

        // Select elements with odd index and replace with 0
        for (int i = 1; i < array2.length; i++) {
            if (i % 2 == 1) {
                array2[i] = 0;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array2));

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        3. Create an array of strings. Fill it in with arbitrary people's names. Sort the array.
           Output the result to the console.
         */

        String[] array3 = new String[]{"Oliver", "Aleks", "Jack", "Marina", "Oscar",
                "Emma", "Thomas", "Rita", "Andrew", "John"};

        System.out.println("Source array: " + Arrays.toString(array3));

        // Sorting the array
        Arrays.sort(array3);

        System.out.println("Sorted array: " + Arrays.toString(array3));

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        4. Implement the bubble sort algorithm by commenting on each step.
         */

        int[] array4 = new int[]{1, 4, 5, 7, 8, 9, 0, 6, 3, 2}; // Create a new array
        System.out.println("Source array: " + Arrays.toString(array4)); // output source array
        boolean isSorted = false; // The pointer is the array sorted or not
        int temp; // Variable to exchange variable values

        // Create while loop since it is not known how many passes through the loop will need to be made
        while (!isSorted) {
            isSorted = true; // Assume the array is sorted
            // Loop for pairwise comparison of all array elements.
            // Use the for loop, since known how many iterations will need to be done
            // So that we do not go beyond the limits of the array,
            // the right border is one less because the i-th and i + 1 elements are being compared
            for (int i = 0; i < array4.length - 1; i++) {
                // Check if the i-th element is greater than the i+1 element.
                // If yes, then set the sorting flag to false.
                // Make an exchange through the previously created variable temp.
                if (array4[i] > array4[i + 1]) {
                    isSorted = false;
                    temp = array4[i];
                    array4[i] = array4[i + 1];
                    array4[i + 1] = temp;
                }
            }
            // System.out.println(Arrays.toString(array4)); // Output to see sorting step by step
        }
        System.out.println("Sorted array: " + Arrays.toString(array4));

    }
}
