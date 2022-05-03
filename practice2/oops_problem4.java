package com.company;
class rectangle{

    int side;
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class oops_problem4 {
    public static void main(String[] args) {
        rectangle sq=new rectangle();
        sq.side=3;
        sq.length=6;
        sq.breadth=7;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}