package com.company;
class employee1{

    private int salary;
//-------------method overloading--------------------------------------
    public employee1(int mysalary) {
        salary = mysalary;
   }
  //---------------------------------------------------------------------
        public int getsalary () {
            return salary;
        }

        public void setsalary ( int n){
            this.salary = n;
        }
    }


public class oops_overload_constructor {
    public static void main(String[] args) {
        employee1 harry=new employee1(1000);

    }
}
