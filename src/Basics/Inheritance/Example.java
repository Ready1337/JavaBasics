package Basics.Inheritance;

public class Example extends SuperExample {

    public Example(String additionalString) {
        super();
        setExampleStringAbleToInheritance(exampleStringAbleToInheritance + additionalString);
    }

    @Override
    public String getExampleStringAbleToInheritance() {
        return exampleStringAbleToInheritance + "// this was override in getter of Example class";
    }
}
