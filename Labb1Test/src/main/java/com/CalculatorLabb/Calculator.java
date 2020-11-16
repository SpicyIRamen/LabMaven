package com.CalculatorLabb;

import org.junit.Test;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanInput = new Scanner(System.in);


   /* public static void main(String[] args) {

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = scanInput.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
        scanInput.close();
    }*/

    public int addition(int a, int b){



        return a + b;
    }

/*
    public static void subtraction(){
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

        kb.close();
        System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
    }

    public static void division(){
        int nOne, nTwo;

        System.out.println("Division");

        System.out.print("\nFirst Number: ");
        nOne = scanInput.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = scanInput.nextInt();

        scanInput.close();
        System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
    }

    public static void multiplication(){
        int nOne, nTwo;

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        nOne = scanInput.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = scanInput.nextInt();

        scanInput.close();
        System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
    }
*/
}
