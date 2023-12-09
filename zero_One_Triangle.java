package com.example1;

import java.util.Scanner;

public class zero_One_Triangle {
    public static void main(String[] args) {
        //program to print 0-1 triangle

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        //outer loop
        for (int i = 1; i <= x; i++) { // for loop handling the vertical direction
            //inner loop
            for (int j = 1; j <= i; j++) { // for loop handling the horizontal direction
               int sum = i+j;
               if (sum % 2 == 0) { //condition for sum of i and j to be even
                   System.out.print("1 ");
               }
               else {   //condition for sum of i and j to be odd
                   System.out.print("0 ");
               }
            }
            System.out.println();   //prints a newline
            // control of loop shifts to this statement after execution of inner for j loop
        }
    }
}
