package com.example1;

import java.util.Scanner;

public class alternateButterflyPattern {
    public static void main(String[] args) {

        System.out.println("Enter half of maximum number of rows : "); // asks user to input
        // half of the maximum number of rows
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        //upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // newline
        }

        //lower half
        // in upper half we used incrementing loops
        // in lower half we will use decrementing loops
        //just invert outer loop in upper half code to obtain code for lower half
        //upper half
        for (int i = n; i >=1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // newline
        }

    }

}