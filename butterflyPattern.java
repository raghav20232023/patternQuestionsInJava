package com.example1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args){
        //program to print butterfly pattern
        int x = 4;
        int number = x+2;


        for (int i = 1 ; i<=x ; i++){
            for (int j = 1 ; j<=i ; j++){   //to handle number of stars
                System.out.print("*");
            }

            for (int j = 1 ; j<=number ; j++){  //to handle number of spaces
                System.out.print(" ");

            }
            number  = number - 2;   //to handle number of stars
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();   //to print new line

        }// upper half of pattern replicated

        //now in lower half of pattern use a decrementing outer loop i.e. just invert the code for upper half
        number = 0 ;
        for (int i = x ; i>=1 ; i--){
            for (int j = i ; j>=1 ; j--){   //to handle number of stars
                System.out.print("*");
            }

            for (int j = number ; j>=1 ; j--){  //to handle number of spaces
                System.out.print(" ");

            }
            number  = number + 2;   //to handle number of stars
            for (int j = i ; j>=1 ; j--){
                System.out.print("*");
            }
            System.out.println();   //to print new line

        }// lower half of pattern replicated
    }

}
// this code has a problem
// it only works for n =4
// to make this code work with all values of n, we have alternateButterflyPattern