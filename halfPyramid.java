package com.example1;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args){
        //program to print half pyramid
        System.out.println("Enter maximum number of stars : "); // asks user to input the number of stars at the
        //base of the pyramid
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = 1; i<=x; i++){ // for loop handling the vertical direction
            for (int j = 1; j<= i; j++) { // for loop handling the horizontal direction
                System.out.print("*");
            }
            System.out.println();   //prints a newline
            // control of loop shifts to this statement after execution of inner for j loop
        }
    }
}
// you can also use i = 0; i<=x and j = 0; j<=i-1 instead of i = 1; i<=x and j=1 ; j<=i
//both are equivalent statements
