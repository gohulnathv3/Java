package com.example.helloworld;

class Employee{
    String emp_name;
    int emp_id;
    String address;
}

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(printResult());
    }
    public static String printResult(){
        Employee e = new Employee();
        e.emp_name = "James";
        e.emp_id = 1001;
        e.address = "13th St, New York";
        return "Employee Name is "+ e.emp_name +" and Employee ID is "+ e.emp_id + " and Employee Address is "+ e.address;

    }
}
