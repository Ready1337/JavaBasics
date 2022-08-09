package Basics.AbstractClassAndMethods;

public class ClassWhichExtendsAbstractClass extends AbstractClass{
    @Override
    public void requiredMethod() {
        System.out.println("I am a required method to declare in classes which extend AbstractClass");
    }
}
