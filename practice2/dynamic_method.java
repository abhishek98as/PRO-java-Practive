package com.company;

class Phone{

    public void greet(){
        System.out.println("good morning");
    }
    public void on(){
        System.out.println("Turning  on phone");
    }
}

class Smartphone extends Phone{

    public void swagat(){
        System.out.println("apka swagat hai");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class dynamic_method {
    public static void main(String[] args) {
       // Phone obj=new Phone();
       // Smartphone smobj=new Smartphone();
       // obj.name();

        Phone obj=new Smartphone();  //YES IT IS ALLLOWED

        obj.greet();
        obj.on();

    }
}
