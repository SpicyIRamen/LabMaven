package com.CalculatorLabb;

import java.util.Scanner;

public class TextProcessor {
    private static final Scanner scanInput = new Scanner(System.in);

    public static int[] getNr() {
        int [] numbers = new int[2];
        System.out.println("\nFirst Number: ");
        numbers[0] = scanInput.nextInt();
        System.out.println("\nSecond Number: ");
        numbers[1] = scanInput.nextInt();
        return numbers;
    }
}
