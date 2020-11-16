package com.CalculatorLabb;

import java.util.Scanner;

public class TextProcessor {

    private static final Scanner scanInput = new Scanner(System.in);


    public static String lowerCase(String a){
        return a.toLowerCase();
    }

    public static String upperCase(String a){
        return a.toUpperCase();

    }

    public static String reverse(String a) {
        StringBuilder sb = new StringBuilder(a);
        return sb.reverse().toString();
    }



}
