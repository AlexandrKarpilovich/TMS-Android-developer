package lesson_02_Java;

import java.util.Scanner;

public class GreetingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input your name:");
        String inputName = sc.nextLine();

        System.out.printf("Hello, %s!", inputName);
    }
}