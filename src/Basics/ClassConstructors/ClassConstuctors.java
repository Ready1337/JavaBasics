package Basics.ClassConstructors;

public class ClassConstuctors {

    public static void main(String[] Args) {
        /*
        Конструкторы в Java: https://vertex-academy.com/tutorials/ru/konstruktory-slovo-v-java/
         */

        ClassWithConstructor objectOfClassWithConstructor1 = new ClassWithConstructor();
        System.out.println(objectOfClassWithConstructor1.getExampleStringField());

        ClassWithConstructor objectOfClassWithConstructor2 = new ClassWithConstructor("Not a deafult String");
        System.out.println(objectOfClassWithConstructor2.getExampleStringField());
    }
}
