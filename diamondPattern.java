package com.example1;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args){
        //program to print diamond pattern
        // we solve this problem by first printing upper half then printing lower half

        System.out.println("Enter half of maximum number of rows : ");
        // asks user to input half of maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i=1; i<=x; i++){
            //spaces
            for (int j =1 ; j<= x-i; j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();   //prints a newline

        }

        //lower half
        // simply reverse the upper half outer loop to get lower half

        for (int i=x; i>=1; i--){
            //spaces
            for (int j =1 ; j<= x-i; j++){
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();   //prints a newline

        }

    }
}
