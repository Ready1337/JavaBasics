package Basics.ClassConstructors;

public class ClassWithConstructor {

    private String exampleStringField;

    public ClassWithConstructor() {
        setExampleStringField("String by default");
    }

    public ClassWithConstructor(String settingString) {
        setExampleStringField(settingString);
    }

    public void setExampleStringField(String settingString) {
        this.exampleStringField = settingString;
    }

    public String getExampleStringField() {
        return exampleStringField;
    }
}
