package com.simpleCalculator;

import java.util.Scanner; //Importing Scanner, is used to include the Scanner class for taking inputs from the user

public class Main {

    public static void main(String[] args) {            //Main method, is the entry point of the programm
        Scanner scanner = new Scanner(System.in);       //Scanner initialization, initializes the scanner object to take input

        System.out.println("Enter First Number : ");
        double num1 = scanner.nextDouble();             //Takes the first number

        System.out.println ("Enter Second Number : ");
        double num2 = scanner.nextDouble();             // Takes the second number

        System.out.println("Enter an Operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);               //Takes the operator as a character

        double result;

        switch (operator){                      //Depending on the operator entered ('+','-','*','/'), the corresponding arthmatic operator is performed
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':                           //If division is selected, the program checks if the second number is zero to avoid division by zero
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
        System.out.println("The result is :" +result);          //The result of the operation is printed
    }
}
