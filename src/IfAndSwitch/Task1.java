package IfAndSwitch;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] Args) {
        System.out.println("Введите число 1, 2 или 3:");

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if (userInput == 1) {
            System.out.println("Вы ввели число 1");
        }
        else if (userInput == 2) {
            System.out.println("Вы ввели число 2");
        }
        else if (userInput == 3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
