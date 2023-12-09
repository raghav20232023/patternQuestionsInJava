package com.example1;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args){
        //program to print floyd's triangle

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int number = 1;

        //outer loop
        for (int i = 1; i<=x; i++){ // for loop handling the vertical direction
            //inner loop
            for (int j = 1; j<= i; j++) { // for loop handling the horizontal direction
                System.out.print(number + " ");
                number ++ ; //incrementing the value of number by 1
            }
            System.out.println();   //prints a newline
            // control of loop shifts to this statement after execution of inner for j loop
        }
    }
}
