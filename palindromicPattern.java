package com.example1;

import java.util.Scanner;

public class palindromicPattern {
    public static void main (String[] args){
        // program to print palindromicPattern

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i=1; i<=x; i++){
            //spaces
            for (int j = 1; j<=x-i; j++){
                System.out.print(" ");
            }

            //first half numbers
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }

            //second half numbers
            for (int j =2; j<=i; j++){
                System.out.print(j);

            }
            System.out.println();   //prints a newline

        }

    }
}
