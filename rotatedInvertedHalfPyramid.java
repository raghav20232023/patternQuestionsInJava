package com.example1;

import java.util.Scanner;

public class rotatedInvertedHalfPyramid {
    public static void main(String[] args) {
        //program to print invertedHalfPyramid rotated by 180 degrees

        System.out.println("Enter maximum number of stars : "); // asks user to input the maximum number of stars
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = 1; i<=x ; i++){
            //inner loop --> to print space
            for (int j=1 ; j<=x-i; j++){
                System.out.print(" ");
            }

            //inner loop --> to print stars
            for (int j = 1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println(); //to print newline
        }


    }
}
