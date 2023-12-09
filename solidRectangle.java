package com.example1;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args){
        //program to print a 2d pattern :- solid rectangle
        //the number of rows and columns are specifed by the user
        // it is achieved by using two nested for loops

        System.out.println("Enter number of rows : ");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        System.out.println("Enter number of columns : ");
        int y = n.nextInt();

        for (int i = 1; i<=x ; i++){ //outer loop for handling rows
            for (int j = 1; j<=y; j++){  //inner loop for handling columns
                System.out.print("*");
            }
            System.out.println(); //prints a new line after the inner loop handles column
            // control of loop shifts to this statement after complete execution of for j loop
        }

    }
}
