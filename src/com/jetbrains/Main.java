package com.jetbrains;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new  Scanner (System.in);
        boolean value = true;

        do {
            try {
                System.out.println("");
                System.out.println("Please enter an integer numerator\t");

                int numerator = scanner.nextInt();

                System.out.println("");
                System.out.println("Please enter an integer denominator\t");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                value = false;

            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("Error Input  was incorrect\n");
                System.out.printf("Suggestion: You must enter integer value\n");


                System.err.printf("%s%n%n", inputMismatchException.getMessage());
                inputMismatchException.printStackTrace();

                StackTraceElement[] traceElements = inputMismatchException.getStackTrace();

                for(StackTraceElement element : traceElements){
                    System.out.printf("%s\t", element.getClassName());
                    System.out.printf("%s\t", element.getFileName());
                    System.out.printf("%s\t", element.getLineNumber());
                    System.out.printf("%s\t", element.getMethodName());
                }

                scanner.nextLine();


            } catch (ArithmeticException arithmeticException) {
                System.out.printf("Error ArithmeticException was thrown\n");
                System.out.printf("Suggestion: You cannot enter 0\n");
            }
            finally {
                System.out.println("This is the finally statement, cleanup can go on here");
            }
        }while (value);

    }

    public static int quotient (int numerator, int denominator) throws ArithmeticException{

        return numerator / denominator;

    }
}
