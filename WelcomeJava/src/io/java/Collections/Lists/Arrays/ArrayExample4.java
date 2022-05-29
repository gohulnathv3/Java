package io.java.Collections.Lists.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
// Revision 2
class Student{
     int rollNo;
     String name;
     int age;

    public Student(){

    }


    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}
public class ArrayExample4 {
    public static void main(String[] args) {

        // Create user-defined class objects
        Student s1 = new Student(1,"Gohul", 23);
        Student s2 = new Student(2, "Akash", 24);
        Student s3 = new Student(3, "Arun", 23);

        // creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        // getting iterator
        Iterator itr = al.iterator();

        // traversing elements of arraylist class objects
        while (itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }

    }
}
