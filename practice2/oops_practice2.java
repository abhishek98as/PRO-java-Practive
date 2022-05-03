package com.company;
class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrating() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("calling mukul bhai...");
    }
}
public class oops_practice2 {

        public static void main(String[] args) {
            cellPhone asus = new cellPhone();
            asus.callFriend();
            asus.vibrating();
            asus.ring();


    }
}
