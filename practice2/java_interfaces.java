package com.company;


interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp (int increment);
}



interface HornBicycle{
    public void blowhorn007();
}
        
class AvonCycle implements Bicycle,HornBicycle{
    void BlowHorn(){
        System.out.println("horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speedUp");

    }
    public void blowhorn007(){
        System.out.println("mai hu naaaaa...po..po...po...");
    }

}
public class java_interfaces {
    public static void main(String[] args) {

        AvonCycle cycleharry=new AvonCycle();
        cycleharry.applyBrake(5);
        //you can create properties in interfaces
        //you can not modify the properties in interfaces as they are final
        System.out.println(cycleharry.a);
        cycleharry.blowhorn007();
    }
}
