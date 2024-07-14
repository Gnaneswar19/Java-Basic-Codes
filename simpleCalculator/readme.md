Explanation:
Importing Scanner: import java.util.Scanner; is used to include the Scanner class for taking input from the user.
Main Method: public static void main(String[] args) is the entry point of the program.
Scanner Initialization: Scanner scanner = new Scanner(System.in); initializes the Scanner object to take input.
User Input:
double num1 = scanner.nextDouble(); takes the first number.
double num2 = scanner.nextDouble(); takes the second number.
char operator = scanner.next().charAt(0); takes the operator as a character.
Switch Case:
Depending on the operator entered (+, -, *, /), the corresponding arithmetic operation is performed.
If division is selected, the program checks if the second number is zero to avoid division by zero.
Output: The result of the operation is printed using System.out.println.