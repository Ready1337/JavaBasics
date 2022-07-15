package Basics.IfAndSwitch;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] Args) {
        System.out.println("Введите число 1:");

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if (userInput == 1) {
            System.out.println("Вы ввели число 1");
        }
        else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
