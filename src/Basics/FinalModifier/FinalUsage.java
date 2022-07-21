package Basics.FinalModifier;

public class FinalUsage {
    //Cannot be changed dut to final
    final private int finalNumber = 10;

    //Look on FinalClass definition
    private FinalClass objectOfFinalClass;

    //Cannot be override in inherited class
    final public int getFinalNumber() {
        return finalNumber;
    }
}


