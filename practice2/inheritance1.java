package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am base & setting x now");

        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a constructor");
    }
}

class Derieved extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        Base b= new Base();
        b.setX(4);
        System.out.println(b.getX());
//------------------------object of derieved class--------------------------------
        Derieved d= new Derieved();
        d.setY(444);



    }
}
