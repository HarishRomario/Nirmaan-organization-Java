package day5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner val =new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter the first number");
		int A= val.nextInt();
		System.out.println("Enter the Second Number");
		int B= val.nextInt();
		System.out.println(" Enter the key : ");
		System.out.println("Enter the 1 with Addition");
		System.out.println("Enter the 2 with Subtraction");
		System.out.println("Enter the 3 with Multiplication");
		System.out.println("Enter the 4 with Division");
		
		int key= val.nextInt();
		switch (key) {
		case 1:{
			System.out.println("Addition: "+A+B);
			break;
		}
		case 2:{
			System.out.println("Subtraction: "+(A-B));
			break;
		}
		case 3:{
			System.out.println("Multiplication: "+A*B);
			break;
		}
		case 4:{
			System.out.println("Division: "+A/B);
			break;
		}	
		default :{
			System.out.println("Invalid Function");
		}
		}
		
		
		
		

	}

}
