package Basics.Overloading;

public class ClassWithOverloadedMethod {

    public static void PrintDifferentBasedOnParametrs(String someString) {
        System.out.println("String overload");
    }

    public static void PrintDifferentBasedOnParametrs(int someInt) {
        System.out.println("Int overload");
    }

    public static void PrintDifferentBasedOnParametrs(char someChar) {
        System.out.println("Char overload");
    }

    public static void PrintDifferentBasedOnParametrs(String someString, int someInt, char someChar) {
        System.out.println("String+Int+Char overload");
    }
}
