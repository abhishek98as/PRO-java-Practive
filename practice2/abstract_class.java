package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println(" i am a base class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good morning");
    }
}
 abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("i am good");
    }
 }
public class abstract_class {
    public static void main(String[] args) {
        Child2 c=new Child2();
    }
}
