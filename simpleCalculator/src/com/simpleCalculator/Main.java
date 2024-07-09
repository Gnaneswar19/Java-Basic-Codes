package com.simpleCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        double num1 = scanner.nextDouble();

        System.out.println ("Enter Second Number : ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an Operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid Operator !");
                return;
        }
        System.out.println("The result is :" +result);
    }
}
