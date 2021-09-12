package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        double p, rate, time, amount, n;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is the principle amount?");
        p = sc.nextDouble();
        System.out.println("What is the rate?");
        rate = sc.nextDouble();
        System.out.println("What is the number of years?");
        time = sc.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        n = sc.nextDouble();

        //calculations
        amount = Math.round((p*Math.pow((1 + ((rate/100)/n)), (n*time)))*100.0)/100.0;

        //outputs
        System.out.println("$" + p + " invested at " + rate + "% for " + (int) time + " years compounded " + (int) n + " times per year is $" + amount + ".");

        //close scanner
        sc.close();
    }
}
