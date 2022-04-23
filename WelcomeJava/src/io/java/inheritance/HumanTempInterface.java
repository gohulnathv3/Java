package io.java.inheritance;

public interface HumanTempInterface {
    public default void speak(){
        System.out.println("This speak method is from HumanTempInterface");
    }
}
