package Basics.Inheritance;

public class Inheritance {

    public static void main(String[] Args) {
        /*
        Налседование в Java: https://vertex-academy.com/tutorials/ru/pravila-nasledovaniya-v-java/
         */

        Example objectOfExampleClassWithInheritanceMethods = new Example(" + not inherited value");
        System.out.println(objectOfExampleClassWithInheritanceMethods.getExampleStringAbleToInheritance());
    }
}
