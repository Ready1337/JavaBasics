package Basics.StaticModifier;

public class ClassWithStaticMethodAndFields {

    public final static int ten = 10;


    public static void printOneHundred() {
        System.out.println("I am result of static method: " + ten*ten);
    }
}
