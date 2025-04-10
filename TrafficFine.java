package day5;

import java.util.Scanner;

public class TrafficFine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle type 2 or 4: ");
		int vt=sc.nextInt();
		System.out.println("Enter your speed: ");
		int speed=sc.nextInt();
		System.out.println("Enter your limit: ");
		int limit=sc.nextInt();
		int es1=speed-limit;
		int es=Math.abs(es1);
		if(vt==2) {
			if(es<10 && 1<=es ) {
				System.out.println("Fine: ₹"+500);
			}else if(es>10 && es<=20) {
				System.out.println("Fine: ₹"+1000);
			}else {
				System.out.println("Fine: ₹"+2000);
			}
		}else if(vt==4) {
			if(es<=10 && 1<=es) {
				System.out.println("Fine: ₹"+1000);
			}else if(es>10 && es<=20) {
				System.out.println("Fine: ₹"+2000);
			}else {
				System.out.println("Fine: ₹"+3000);
			}
			
		}else {
			System.out.println("invaild vehicle");
		}
	}

}
