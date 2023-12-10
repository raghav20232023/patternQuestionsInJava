package com.example1;

import java.util.Scanner;

public class solidRhombus {
    public static void main(String [] args){

        System.out.println("Enter maximum number of rows : "); // asks user to input the maximum number of rows
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = x ; i>=1; i--){

            for (int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            System.out.print("* * * * *");
            System.out.println();
        }

    }
}
