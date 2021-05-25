package edu.simple.tasks.task1;

import java.util.Scanner;

public class Task1 {



    /*Транспонировать матрицу MxN.
    Задавать размер матрицы необходимо из консоли.*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в двумерном массиве");
        int rows = scan.nextInt();
        System.out.println("Введите количество столбцов в двумерном массиве");
        int columns = scan.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] tMatrix = new int[columns][rows];
        System.out.println("Начальная матрица :");
        fillMatrix(matrix);
        System.out.println("Транспонированная матрица :");
        transpMatrix(matrix, tMatrix);

    }

    public static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        return matrix;
    }

    public static int[][] transpMatrix(int[][] matrix, int[][] tMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return tMatrix;
    }
}
