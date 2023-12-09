package com.example1;

import java.util.Scanner;

public class halfPyramidWithNumbers {
    public static void main(String[] args){
        // program to print half pyramids using numbers

        System.out.println("Enter maximum number : "); // asks user to input the maximum number
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        for (int i = 1 ; i<=x; i++){    //outer loop handling number of rows or vertical pointer
            for (int j =1; j<=i; j++){  //inner loop handling number of elements in a row or columns
                // or horizontal pointer
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
