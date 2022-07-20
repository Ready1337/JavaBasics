package Basics.Modifiers;

import Basics.ModifiersDifferentPackage.ExampleOfClassWithProtectedField;

public class ExampleOfClassInheritedFromClassWithProtectedField extends ExampleOfClassWithProtectedField {
    public String superProtectedField = super.protectedField;
}
