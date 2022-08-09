package Basics.Polymorphism;

public class Polymorphism {

    public static void main(String[] Args) {
        /*
        Полиморфизм в Java: https://vertex-academy.com/tutorials/ru/chto-takoe-polimorfizm-java/
         */

        ClassWithPolymorphMethods printer = new ClassWithPolymorphMethods();
        printer.printSomeThing();
        printer.printSomeThing("anotherThing");

        ClassThatExtendsClassWithPolymorphMethods extendedPrinter = new ClassThatExtendsClassWithPolymorphMethods();
        extendedPrinter.printSomeThing();
    }
}
