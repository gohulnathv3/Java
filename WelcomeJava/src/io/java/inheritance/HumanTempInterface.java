package io.java.inheritance;
// Revision 1

public interface HumanTempInterface {
    public default void speak(){
        System.out.println("This speak method is from HumanTempInterface");
    }
}
