package com.company;

public class Swap2Numbers {

    public static void main(String[] agrs){
        int a=10, b=20;
        System.out.println("Before swapping values are "+a+" "+b);
        //logic 1 --using thired variable

      /*  int t=a;
        a=b;
        b=t;
*/

        //2nd method without using thrid variable

/*
        a=a+b;  //10+20
        b=a-b;  //30-20
        a=a-b; //30-10

  */

        //Logic 3--> use * and division without using third variable
        // a and and b is not zero

        /*
        a=a*b;//10*20=200
        b=a/b;//200/20=10
        a=a/b;//200/10=20

  */
        //logic 4 -bitwise XOR (^)

        a=a^b;//10^20=30
        b=a^b;//30^20==10
        a=a^b;//30^10=20



        System.out.println("Before swapping values are "+a+" "+b);
    }
}