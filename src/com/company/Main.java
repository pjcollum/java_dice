package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {        //rolling dice game
       Random num = new Random();
        int x = num.nextInt(6)+1;      //removes zero output

        System.out.println("You rolled a: " + x);




    }
}
