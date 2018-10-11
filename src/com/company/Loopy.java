package com.company;

public class Loopy {
    public static void main(String[] args){
        int x = 1;
        System.out.print("Before the Loop");
        while (x<4){
            System.out.print("In the Loop");
            System.out.print("Value of x is " + x);
            x = x + 1;
        }
        System.out.print("This is after the loop");
    }
}
//hhh