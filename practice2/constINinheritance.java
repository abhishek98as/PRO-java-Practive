package com.company;

class Base1{

    Base1(){
        System.out.println("i am constructor");
    }

    Base1(int a){
        System.out.println("i am a overloadedconstructor with value of a as"+a);
    }


}
//-----------------------------------------------------------------
 class Derieved1 extends Base1 {

    Derieved1() {
        //super(0);
        System.out.println("i am derieved class constructor");
    }

    Derieved1(int x, int y) {
        super(x);
        System.out.println("i am over loaded constructor of derieved with value of b as" + y);
    }
  //-----------------------------------------------------------------------------------------

    class childofDerieved extends Derieved1 {
        childofDerieved() {
            System.out.println("i am of child of derieved constructor");
        }

        childofDerieved(int x, int y, int z) {
            super(x, y);
            System.out.println("i am an overloaded constructor of derieved with value of c as" + z);

        }


    }
}
public class constINinheritance {
    public static void main(String[] args) {
        //Base1 b=new Base1();
       // Derieved1 d=new Derieved1(14,9);

    }
}
