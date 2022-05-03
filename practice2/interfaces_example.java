package com.company;

interface MyCamera{
   void takeSnap();
   void recordVideo();
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting........");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
   public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("taking snap");
    }

    public String[] getNetwork(){
        System.out.println("getting list of networks");
        return new String[]{"Harry", "Prashant","Anjali5G"};
    }

    @Override
    public String[] getNetworks() {
        return new String[0];
    }

    public void connectToNetwork(String network){
        System.out.println("connecting to"+ network);
    }

}
public class interfaces_example {
    public static void main(String[] args) {

        MySmartPhone ms= new MySmartPhone();
        String[] ar=ms.getNetwork();
        for(String item : ar){
            System.out.println(item);
        }
    }
}
