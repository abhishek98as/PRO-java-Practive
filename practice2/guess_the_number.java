package com.company;
import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int inputnumber;
    public int noofguesses;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);

    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc= new Scanner((System.in));
        inputnumber=sc.nextInt();
    }
    boolean iscorrectnumber() {

        if (inputnumber==number){
            return true;
        }
        else if (inputnumber<number){
            System.out.println("too low.....");
        }
        else if(inputnumber>number){
            System.out.println("too high..........");
        }
        return false;
    }
}
public class guess_the_number {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while (!b) {
            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
}
