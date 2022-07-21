package Basics.Overloading;

public class Overloading {

    public static void main(String[] Args) {

        /*
        Перегрузка методов в Java: https://vertex-academy.com/tutorials/ru/peregruzka-metodov-v-java/
         */

        ClassWithOverloadedMethod.PrintDifferentBasedOnParametrs(1);
        ClassWithOverloadedMethod.PrintDifferentBasedOnParametrs("1");
        ClassWithOverloadedMethod.PrintDifferentBasedOnParametrs('1');
        ClassWithOverloadedMethod.PrintDifferentBasedOnParametrs("1", 1, '1');
    }
}
