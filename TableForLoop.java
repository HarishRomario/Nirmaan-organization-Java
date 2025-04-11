package Day6;

import java.util.Scanner;

public class TableForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table: ");
		int Table=sc.nextInt();
		System.out.println("Enter the range :");
		int range=sc.nextInt();
		
		for(int i=1;i<=range;i++){
			System.out.println(i+"x"+Table+"="+i*Table);
		}

	}

}
