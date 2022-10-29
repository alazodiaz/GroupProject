package com.java.class19;

public class Furniture {
    String color="Green";
}

class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(color); //prints the Local Variable
        System.out.println(this.color); //prints the instance variable from SAME CLASS
        System.out.println(super.color);// prints the instance variable of PARENT CLASS
    }
}

class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
