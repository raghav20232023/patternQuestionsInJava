package com.example1;

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args){
        // program to print invertedHalfPyramid
        //simply invert the for loops to obtain inverted half pyramid i.e. instead of incrementing loop
        // use a decrementing loop

        System.out.println("Enter maximum number of stars : "); // asks user to input the number of stars at the
        //base of the pyramid
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = x; i>=1; i--){ // for loop handling the vertical direction
            for (int j = i; j>= 1; j--) { // for loop handling the horizontal direction
                System.out.print("*");
            }
            System.out.println();   //prints a newline
            // control of loop shifts to this statement after execution of inner for j loop
        }


    }
}
// the halfPyramid used an incrementing for loop
// the code for invertedHalfPyramid is similar to halfPyramid,
//but instead we have used a decrementing for loop