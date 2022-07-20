package Basics.Modifiers;

import Basics.Classes.ExampleClass;

public class DataCollectorBasedOnModifiers {
    private String collectedFromPublicField;
    private String collectedFromProtectedField;
    private String collectedFromDefaultField;
    private String collectedFromPrivateField = "(I am private)";

    public DataCollectorBasedOnModifiers(String someString) {
        setCollectedFromPublicField(someString);
        setCollectedFromProtectedField(someString);
        setCollectedFromDefaultField(someString);
        setCollectedFromPrivateField(someString);
    }

    public void printValuesCollectedFromDifferentModifiers() {
        System.out.println(getCollectedFromPublicField());
        System.out.println(getCollectedFromProtectedField());
        System.out.println(getCollectedFromDefaultField());
        System.out.println(getCollectedFromPrivateField());
    }


    public String getCollectedFromPublicField() {
        return collectedFromPublicField;
    }
    public String getCollectedFromProtectedField() {
        return collectedFromProtectedField;
    }
    public String getCollectedFromDefaultField() {
        return collectedFromDefaultField;
    }
    public String getCollectedFromPrivateField() {
        return collectedFromPrivateField;
    }


    public void setCollectedFromPublicField(String collectedFromPublicField) {
        this.collectedFromPublicField = collectedFromPublicField + new ExampleClass().publicField;
    }

    public void setCollectedFromProtectedField(String collectedFromProtectedField) {
        this.collectedFromProtectedField = collectedFromProtectedField + new ExampleOfClassInheritedFromClassWithProtectedField().superProtectedField;
    }

    public void setCollectedFromDefaultField(String collectedFromDefaultField) {
        this.collectedFromDefaultField = collectedFromDefaultField + new ExampleOfClassWithDefaultField().defaultField;
    }

    public void setCollectedFromPrivateField(String collectedFromPrivateField) {
        this.collectedFromPrivateField = collectedFromPrivateField + getCollectedFromPrivateField();
    }
}
