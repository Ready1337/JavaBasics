package Basics.SettersAndGetters;

import Basics.SettersAndGetters.ClassWithSettersAndGetters;

public class SettersAndGetters {
    /*
    Сеттеры и геттеры в Java: https://vertex-academy.com/tutorials/ru/gettery-i-settery/
     */

    public static void main(String[] Args) {

        ClassWithSettersAndGetters objectOfClassWithSettersAndGetters = new ClassWithSettersAndGetters();

        System.out.println("Value of exampleOfPrivateField before setter: " +
                objectOfClassWithSettersAndGetters.getExampleOfPrivateField());

        objectOfClassWithSettersAndGetters.setExampleOfPrivateStringField("Example String");

        System.out.println("Value of exampleOfPrivateField after setter: " +
                objectOfClassWithSettersAndGetters.getExampleOfPrivateField());
    }
}
