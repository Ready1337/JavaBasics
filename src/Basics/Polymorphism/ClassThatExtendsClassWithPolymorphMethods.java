package Basics.Polymorphism;

public class ClassThatExtendsClassWithPolymorphMethods extends ClassWithPolymorphMethods {
    @Override
    public void printSomeThing() {
        System.out.println("I am printSomeThing() method in ClassThatExtendsClassWithPolymorphMethods class:\nsomeThing");
    }
}
