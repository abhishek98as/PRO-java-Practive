package com.company;


    class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}

public class oops_1 {
    public static void main(String[] args) {
        Employee harry=new Employee();
        Employee john=new Employee();


        harry.id=12;
        harry.name="code with harry";
        harry.salary=5467;

        john.id=34;
        john.name="khandelwal";
        john.salary=65676;


        harry.printDetails();
        john.printDetails();
        int salary=john.getsalary();
        System.out.println(salary);
      //  System.out.println(harry.id);
      //  System.out.println(harry.name);

    }
}
