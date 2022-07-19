package Basics.Inheritance;

//this class cannot be inherited: final
final public class Example extends SuperExample {

    public Example(String additionalString) {
        super();
        setExampleStringAbleToInheritance(exampleStringAbleToInheritance + additionalString);
    }

    @Override
    public String getExampleStringAbleToInheritance() {
        return exampleStringAbleToInheritance + "// this was override in getter of Example class";
    }
}
