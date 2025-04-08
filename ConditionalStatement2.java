package day5;

import java.util.Scanner;

public final class ConditionalStatement2 {

	public static void main(String[] args) {
		Scanner age= new Scanner(System.in);
		System.out.println("Enter the age: ");
		int election=age.nextInt();
		 
		if(18<=election) {
			System.out.println("you are eligiable");
		}
		else {
			System.out.println(" you are not eligiable");
		}

	}

}
