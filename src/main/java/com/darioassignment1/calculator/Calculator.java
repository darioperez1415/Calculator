/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.darioassignment1.calculator;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author darioperez
 */
public class Calculator {

   // Method to find maximum of two numbers
    public static double findMaximum(double n1, double n2) {
        return Math.max(n1, n2);
    }

    // Method to find minimum of two numbers
    public static double findMinimum(double n1, double n2) {
        return Math.min(n1, n2);
    }

    // Method to generate a random number between a given range
    public static double generateRandom(double min, double max) {
        Random rand = new Random();
        return min + (rand.nextDouble() * (max - min)); // Generate random double in range [min, max)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1 - Add \n2 - Subtract \n3 - Multiply \n4 - Divide \n5 - Maximum \n6 - Minimum \n7 - Random");
            System.out.println("Choose Operation:");
            int operator = sc.nextInt();

            double n1 = 0, n2 = 0;
            if (operator != 7) {
                System.out.println("Enter first number:");
                n1 = sc.nextDouble();
                System.out.println("Enter second number:");
                n2 = sc.nextDouble();
            }

            double result = 0;
            switch (operator) {
                case 1:
                    result = n1 + n2; // Add
                    break;
                case 2:
                    result = n1 - n2; // Subtract
                    break;
                case 3:
                    result = n1 * n2; // Multiply
                    break;
                case 4:                 // error handeling
                    if (n2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        return;
                    } else {
                        result = n1 / n2;
                    }
                    break;
                case 5:
                    result = findMaximum(n1, n2);
                    break;
                case 6:
                    result = findMinimum(n1, n2);
                    break;
                case 7:
                    // If option 7, ask for the range for random number generation
                    System.out.println("Enter minimum value for random number:");
                    double min = sc.nextDouble();
                    System.out.println("Enter maximum value for random number:");
                    double max = sc.nextDouble();
                    result = generateRandom(min, max);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result is: " + result);

        } catch (Exception e) {
            System.out.println("An error occurred. Please enter valid inputs.");
        } finally {
            sc.close();
        }
    }
}