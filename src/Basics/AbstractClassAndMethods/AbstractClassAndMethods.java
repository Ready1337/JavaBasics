package Basics.AbstractClassAndMethods;

public class AbstractClassAndMethods {

    public static void main(String[] Args) {
        /*
        Абстрактные классы и методы в Java: https://vertex-academy.com/tutorials/ru/abstraktnyj-klass-java/
         */

        ClassWhichExtendsAbstractClass name = new ClassWhichExtendsAbstractClass();

        name.requiredMethod();
        name.notRequiredMethod();
    }

}
