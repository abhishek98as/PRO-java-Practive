package com.company;

class Circle{
    public int radius;

    Circle(int r){
        System.out.println("i am circle parameterised constructor");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    Cylinder1(int r, int h ){
        super(r);
        System.out.println("i am cylinder1 parametersided contructor");
        this.height=h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.radius;
    }


}
public class inheritence_practice1 {
    public static void main(String[] args) {
        // problem 1.
        //Circle objc=new Circle(12);
        Cylinder1 obj=new Cylinder1(12, 4);

    }
}
