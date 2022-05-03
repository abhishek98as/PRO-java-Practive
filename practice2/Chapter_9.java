package com.company;
class myemployee{
   private int id;
   private String name;

    public myemployee(){
        id=45;
        name="hii my name is abhishek singh";
    }

   public String getName(){
       return name;
   }
   public void setName(String n){
       this.name=n;
   }
    public void setId(int i) {
        id = i;
    }

    public int getId(){
       return id;


   }

}
public class Chapter_9 {
    public static void main(String[] args) {
       myemployee harry=new myemployee();

       harry.setName("code with harry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
       //harry.id=45;
      // harry.name="code with harry";
    }
}
