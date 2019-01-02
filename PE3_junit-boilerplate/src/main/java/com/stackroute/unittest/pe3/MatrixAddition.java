package com.stackroute.unittest.pe3;

import java.util.Scanner;


public class MatrixAddition{

    public static void sumOfMatrixes(int row, int col, int matrix1[][], int matrix2[][]){   //method to add matrix
        int i, j;
        int SumOfmatrixes[][] = new int[row][col];
        for (i = 0; i < row ; i++){                      // loop on rows to add
            for (j = 0; j < col; j++){                   // loop on columns to add
                SumOfmatrixes[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(SumOfmatrixes[i][j]+" ");
            }
        }
    }
    public static void main(String args[]){                      //main method
        Scanner sc = new Scanner(System.in);
        int i, j, row, col;
        System.out.println("Enter number of rows of matrix: ");
        row = sc.nextInt();
        System.out.println("Enter number of columns of matrix: ");
        col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];

        System.out.println("Enter elements of first matrix: ");
        for (i = 0; i < row ; i++){            //loop to print first matrix as per size
            for (j = 0; j < col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enetr the elements of second matrix:");
        for (i = 0; i < row ; i++){                //loop to print first matrix as per size
            for (j = 0; j < col; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        sumOfMatrixes(row, col, matrix1, matrix2);
    }
}