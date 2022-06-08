package io.java.Collections;
// Revision 2

public class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }
//  After adding this functions, we can able to eliminate the repeated name in object instances.
    @Override
    public int hashCode() {
//        return super.hashCode();
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return obj instanceof Person && this.name.equals(((Person) obj).name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
