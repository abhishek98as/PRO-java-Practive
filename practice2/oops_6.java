package com.company;

class abhi {

    private int id;
    private String name;

    public abhi(){
        id=45;
        name="ypur-name-here";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    //-----constructor---- method define-------------------------------------------------
    public abhi(String myName,int myId) {
        id = myId;
        name = myName;
    }
}
//------------------------------------------------------------------------------
public class oops_6 {
    public static void main(String[] args) {

//thi is object for abhi-------------------------------------------
        abhi harry=new abhi();
        System.out.println(harry.getName());

        System.out.println(harry.getId());



    }

     }

