/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial4;

/**
 *
 * @author Austin
 */
import java.util.Random;

public class T1 {
    
    // Method to find the largest integer n so that n^3 is less than 2000
    public static int findLargestN() {
        int n = 1;
        while (Math.pow(n, 3) < 2000) {
            n++;
        }
        return n - 1; // Subtract 1 because we need the last n that was less than 2000
    }

    // Method to display the square numbers of the first twelve integers
    public static void displaySquareNumbers() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("The square of " + i + " is: " + (i * i));
        }
    }

    // Method to display a 4-by-5 matrix using random numbers from 0 to 100
    public static void displayRandomMatrix() {
        Random random = new Random();
        int rows = 4;
        int columns = 5;
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(101);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to compute the sum of numbers from 1 to a given number
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Method to compute the sum of the series: 1/25 + 2/24 + 3/23 ... + 25/1
    public static double computeSeriesSum() {
        double sum = 0.0;
        for (int i = 1; i <= 25; i++) {
            sum += (double) i / (26 - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        //a
        System.out.println("The largest integer n so that n^3 is less than 2000: " + findLargestN());
        
        // b
        System.out.println("Square numbers of the first twelve integers:");
        displaySquareNumbers();
        
        // c
        System.out.println("A 4-by-5 matrix of random numbers from 0 to 100:");
        displayRandomMatrix();
        
        // d
        int n = 10;
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sumToN(n));
        
        // e
        System.out.printf("The sum of the series is: %.2f%n", computeSeriesSum());
    }
}
