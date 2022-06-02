package io.java.accessmodifiers.package1;

import io.java.accessmodifiers.package2.C;
// Revision 3
class A{
    public void sayHello(){
        System.out.println("Hello this is from Class A");
    }
}

public class B {
    public static void main(String[] args) {

        A a = new A();
        a.sayHello();
        C c = new C();
        c.sayHello();

    }

}