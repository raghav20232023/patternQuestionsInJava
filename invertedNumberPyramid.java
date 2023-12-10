package com.example1;

import java.util.Scanner;

public class invertedNumberPyramid {
    public static void main(String[] args) {
        //program to make a number pyramid

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= x; j++) {
                System.out.print(j + " ");
            }
            System.out.println();   //prints newline


        }
    }
}