/**
* <h1 > Application.java </h1 >
* <p>
* This class is designed for processing Hello World in Java .
* It is part of Lab 1 Exercise A.
* </p>
* <p>
* <b> Note :</b> This file runs Hello World Program
* </p>
*
* <p><b> Submission Date :</b> July 4th, 2024 </p>
*
* @author Mahdi Ansari
* @author William Arthur Philip Louis
* @version 1.0
*/

package com.hasnain.calculator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length > 0){
			//takes arguments as (operator num1 num2)
			// e.g multiply 5 2
			// will give 10
			
			String operation = args[0].toLowerCase();

            switch (operation) {
                case "divide":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result : " + divide(num1, num2));
                    }
                    break;
                case "factorial":
                    if (args.length == 2) {
                        double number = Double.parseDouble(args[1]);
                        System.out.println("Result : " + factorial(number));
                    }
                    break;
                case "multiply":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result : " + multiply(num1, num2));
                    }
                    break;
                case "subtract":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result : " + subtract(num1, num2));
                    }
                    break;
                case "add":
                    if (args.length == 3) {
                        double num1 = Double.parseDouble(args[1]);
                        double num2 = Double.parseDouble(args[2]);
                        System.out.println("Result : " + add(num1, num2));
                    } 
                    break;
            
            }
			
		
			
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Operation (e.g., add, subtract, multiply, divide):");
			String operation = scanner.next();
			
			switch (operation.toLowerCase ()) {
				case "add":
					System.out.println ("Enter the first operand :");
					double num1 = scanner.nextDouble();
					System.out.println("Enter the second operand :");
					double num2 = scanner.nextDouble();
					System.out.println("Result : " + add(num1 , num2));
					break;
				case "factorial":
					System.out.println("Enter a number :");
					double number = scanner.nextDouble ();
					System.out.println("Result : " + factorial(number));
					break;
				case "multiply":
					System.out.println ("Enter the first operand :");
					double num3 = scanner.nextDouble();
					System.out.println("Enter the second operand :");
					double num4 = scanner.nextDouble();
					System.out.println("Result : " + multiply(num3 , num4));
					break;	
				case "subtract":
					System.out.println ("Enter the first operand :");
					double num5 = scanner.nextDouble();
					System.out.println("Enter the second operand :");
					double num6 = scanner.nextDouble();
					System.out.println("Result : " + subtract(num5 , num6));
					break;	
				case "divide":
					System.out.println ("Enter the first operand :");
					double num7 = scanner.nextDouble();
					System.out.println("Enter the second operand :");
					double num8 = scanner.nextDouble();
					System.out.println("Result : " + divide(num7 , num8));
					break;
			
			 }
			
			
		}
		
	}
	// adding 
	public static double add( double a, double b) {
		return a + b;
	}
	//factorial
	 public static double factorial(double n) {
		if (n <= 1) {
		return 1;
		} else {
		return n * factorial (n - 1);
		}
	}
	 //multiply
	 public static double multiply( double a, double b) {
			return a * b;
		}
	 //divide
	 public static double divide( double a, double b) {
			return a/b;
		}
	 //subtract
	 public static double subtract( double a, double b) {
			return a - b;
		}
	 
}
