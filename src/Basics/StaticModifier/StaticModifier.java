package Basics.StaticModifier;

public class StaticModifier {

    public static void main(String[] Args) {

        /*
        Модификатор static в Java:
        1) Переменные: https://vertex-academy.com/tutorials/ru/modifikator-static-v-java/
        2) Методы: https://vertex-academy.com/tutorials/ru/modifikator-static-v-java-metody/
         */

        System.out.println("I am static variable: " + ClassWithStaticMethodAndFields.ten);
        ClassWithStaticMethodAndFields.printOneHundred();
    }
}
