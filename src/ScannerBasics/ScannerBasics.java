package ScannerBasics;

import java.util.Scanner; //импорт сканера

public class ScannerBasics {

    public static void main(String[] Args) {
        /*
        Сканер позволяет брать input из консоли: https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/
         */

        //Пример 1
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);

        //Пример 2
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt(); //считывает первое число и присваивает значение в number1
        int number2 = k.nextInt(); //считывает второе число и присваивает значение в number2
        System.out.println(number1 + number2); //выводит сумму number1 + number2

        //Пример 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);

        //Пример 4
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase11 = sc2.nextLine();
        String phrase2 = sc2.nextLine();
        System.out.println(phrase11 + " " + phrase2);

        //Пример 5
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase12 = sc3.next();
        System.out.println(phrase12);

        //Пример 6, вводить надо через запятую, это баг
        System.out.print("Введите любое дробное число: ");
        Scanner scan1 = new Scanner(System.in);
        double num = scan1.nextDouble();
        System.out.println ("Вы ввели число " + num);
    }
}
