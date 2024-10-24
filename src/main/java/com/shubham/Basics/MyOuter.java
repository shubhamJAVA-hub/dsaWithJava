package com.shubham.Basics;

class Base{
   public void show(){
        System.out.println("Base");
    }
}

class Derived extends Base{
    public void show(){
        System.out.println("Base");
    }
}

class MyOuter {

    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }

}


