package Basics.Inheritance;

public class SuperExample {

    private String exampleStringUnableToInheritance;
    public String exampleStringAbleToInheritance;

    public SuperExample() {
        setExampleStringAbleToInheritance("Inherited value");
    }

    public void SuperMethod() {
        System.out.println("Inheritance made this possible");
    }

    public void setExampleStringAbleToInheritance(String someString) {
        this.exampleStringAbleToInheritance = someString;
    }

    public String getExampleStringAbleToInheritance() {
        return exampleStringAbleToInheritance;
    }
}
