package com.example1;

import java.util.Scanner;

public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args){
        //program to print invertedHalfPyramidWithNumbers
        //we have to use a decrementing for loop as outer loop
        // we have to use incrementing for loop as inner loop


        System.out.println("Enter maximum number : "); // asks user to input the maximum number
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = x; i>=1; i--){ // for loop handling the vertical direction
            for (int j = 1; j<= i; j++) { // for loop handling the horizontal direction
                System.out.print(j + " ");
            }
            System.out.println();   //prints a newline
            // control of loop shifts to this statement after execution of inner for j loop
        }
    }
}
