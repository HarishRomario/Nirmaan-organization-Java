package Day6;

import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num: ");
			int A =sc.nextInt();
			int count=0;
			for(int i=1;i<=A;i++) {
				if(i%3==0) {
					count++;
				}
			}
					System.out.println("Total count "+count);
				
			
	}
			
			
	}
    

