package OutputIntoConsole;

public class OutputIntoConsole {

    public static void main(String[] Args) {
        /*
        Вывод на консоль: https://vertex-academy.com/tutorials/ru/system-print-i-system-println/

        Есть 2 способа вывести что-то в консоль:

            1) System.out.print() - вывод на консоль без перевода курсора на новую строку

            2) System.out.println() - вывод на консоль с переводом курсора на новую строку

        Разницу можно посмотреть на примерах:
         */

        //Пример №1
        System.out.println("Я");
        System.out.println("изучаю");
        System.out.println("Java");

        //Пример №2
        System.out.print("Я");
        System.out.print("изучаю");
        System.out.print("Java");
    }
}
