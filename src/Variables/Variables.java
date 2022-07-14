package Variables;

public class Variables {

    public static void main(String[] Args) {
        /*
        Создание переменных: https://vertex-academy.com/tutorials/ru/sozdanie-peremennyx-i-tipy-peremenny/
        Присвоить значение переменной: https://vertex-academy.com/tutorials/ru/inicializaciya-peremennyx-v-java/

        Прежде чем использовать переменную, ее необходимо объявить:
            тип_переменной имя_переменной;

        Типы переменных(primitives):
            Целочисленные:
                byte
                short
                int
                long

            С плавающей точкой:
                float
                double

            Символы:
                char

            Логические:
                boolean

            Еще есть тип String, но о нем позже

        Имя переменной пишется в CamelCase
         */

        //Целочисленные
        byte exampleByte;
        short exampleShort;
        int exampleInt;
        long exampleLong;

        //С плавающей точкой
        float exampleFloat;
        double exampleDouble;


        //Символы
        char exampleChar;

        //Логические
        boolean exampleBoolean;

        /*
        Переменным можно присваивать значения с помощью знака "="
        Делается это 2-мя способами
         */
        int example1;
        example1 = 10;
        System.out.println(example1);

        int example2 = 10;
        System.out.println(example2);

        //Инифиализация переменных других типов
        byte number1 = 15;
        short number2 = 100;
        long number3 = 100000000;
        String title = "Обожаю Java";
        char letter = 'M';
        double sum = 145.34567;
        float pi = 3.14f;
        boolean result = true;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println (title);
        System.out.println (letter);
        System.out.println (sum);
        System.out.println (pi);
        System.out.println (result);
    }
}
