package com.company;


class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class oops_practice_1 {
    public static void main (String[] args){
       Employee1 harry=new Employee1();
       harry.salary=3300;

       harry.setName ("Codde with harry");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

    }
}
