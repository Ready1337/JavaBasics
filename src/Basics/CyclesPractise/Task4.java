package Basics.CyclesPractise;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] Args) {
        System.out.print("Введите любое целое число: ");

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= userInput; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + userInput + ": " + sum);
    }
}
