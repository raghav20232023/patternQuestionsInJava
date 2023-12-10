package com.example1;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        //program to make a number pyramid

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = 1; i <= x; i++) {
            //spaces
            for (int j = 1; j <=x-i; j++) {
                System.out.print(" ");
            }

            //numbers ---> print row number row number times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();   //prints newline


        }
    }
}
