package com.example1;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args){
        //program to print hollow rectangle
        System.out.println("Enter number of rows : ");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        System.out.println("Enter number of columns : ");
        int y = n.nextInt();

        //outer loop
        for (int i = 1; i<=x; i++){
            //inner loop
            for (int j =1; j<=y; j++){
                //cell --> (i,j)
                if ( i == 1 || j ==1 || i==x || j==y){//tracking of boundary of hollow rectangle
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();//print new line after handling inner loops

        }

    }
}
