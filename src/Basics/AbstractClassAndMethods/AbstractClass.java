package Basics.AbstractClassAndMethods;

public abstract class AbstractClass {
    abstract void requiredMethod();

    public void notRequiredMethod() {
        System.out.println("I am not a required method to declare in classes which extend AbstractClass");
    }
}
