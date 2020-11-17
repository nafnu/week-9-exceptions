package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new  Scanner (System.in);
        System.out.println("Please enter an integer numerator/t");

        int numerator = scanner.nextInt();

        System.out.println("Please enter an integer denominator/t");
        int denominator = scanner.nextInt();

        try {
            int result = quotient(numerator, denominator);
            System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
        }catch (ArithmeticException arithmeticException){
            System.out.printf("Error ArithmeticException was thrown");
            System.out.printf("Suggestion: You cannot enter 0");
        }


    }

    public static int quotient (int numerator, int denominator) throws ArithmeticException{

        return numerator / denominator;

    }
}
