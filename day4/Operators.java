package day4;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner hh=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNumber=hh.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber=hh.nextInt();
		System.out.println("");
		System.out.println("Arithmatic Operation: ");
		System.out.println("Addition: "+(firstNumber+secondNumber));
		System.out.println("Subtraction: "+(firstNumber-secondNumber));
		System.out.println("Multiplication: "+(firstNumber*secondNumber));
		System.out.println("Dividsion: "+(firstNumber/secondNumber));
		System.out.println("Module: "+(firstNumber%secondNumber));
		System.out.println("");
		System.out.println("Relational Operator:");
		System.out.println(firstNumber+" > "+secondNumber+": "+(firstNumber>secondNumber));
	    System.out.println(firstNumber+" < "+secondNumber+": "+(firstNumber<secondNumber));
	    System.out.println(firstNumber+" >= "+secondNumber+": "+(firstNumber>=secondNumber));
	    System.out.println(firstNumber+" <= "+secondNumber+": "+(firstNumber<=secondNumber));
	    System.out.println(firstNumber+" == "+secondNumber+": "+(firstNumber==secondNumber));
	    System.out.println("");
	    System.out.println("Logical Operations:");
	    System.out.println(firstNumber+" > 10"+" AND "+secondNumber+" <50): "+(firstNumber>10 && secondNumber<50));
	    System.out.println(firstNumber+" > 5"+" OR "+secondNumber+" <50): "+(firstNumber<5 && secondNumber>100));
	    System.out.println();
	    System.out.println("Assignment Operator");
	    int initialValue=10;
	    System.out.println("After += : "+(initialValue+=firstNumber));
	    System.out.println("After -= : "+(initialValue-=firstNumber));
	    System.out.println("After *= : "+(initialValue*=firstNumber));
	    System.out.println("After /= : "+(initialValue/=firstNumber));
	    System.out.println("After %= : "+(initialValue%=firstNumber));
	    System.out.println("");
	    System.out.println("Uniary Operators:");
	    System.out.println("initial Value:"+firstNumber);
	    System.out.println("After Increment: "+(++firstNumber));
	    System.out.println("After Increment: "+(--firstNumber));
	    System.out.println("");
	    System.out.println("Conditional Operators:");
	    String result=(firstNumber%2==0)?"Even":"odd";
	    System.out.println(firstNumber+" is "+result);
	    hh.close();
	}

}
