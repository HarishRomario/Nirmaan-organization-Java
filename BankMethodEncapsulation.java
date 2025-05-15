package day15;

import java.util.Scanner;

public class BankMethodEncapsulation {
	 private int id;
	 private String name;
	 private int balance;
	 private int accno;
	 int pin = 1234;
	 
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance,int pin1) {
		if(pin==pin1) {
		
		this.balance = balance;
		System.out.println("  successfully");
	}else {
		System.err.println("Incrt pin");
	}
		}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

			
	

	public BankMethodEncapsulation(int id, String name, int balance, int accno) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accno = accno;
	}

	public BankMethodEncapsulation() {
		super();
	}
	
	@Override
	public String toString() {
		return "BankMethodEncapsulation [id=" + id + ", name=" + name + ", balance=" + balance + ", accno=" + accno
				+ "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankMethodEncapsulation kk= new BankMethodEncapsulation();
		boolean iswork = true;
		
	while (iswork) {
		System.out.println("Enter 1 for add Account");
		System.out.println("Enter 2 for update balance");
		System.out.println("Enter 3 for withdraw amount");
		System.out.println("Enter 4 for Show Account");
		System.out.println("Enter 5 for Exit");
		int key = sc.nextInt();
		
	    if (key == 1){
		    System.out.println("Enter the Account Id");
		    int id = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Account Name");
		    String Name = sc.nextLine();
		    System.out.println("Enter the balance");
		    int Balance = sc.nextInt();
		    System.out.println("Enter the Account Number");
		    int Number = sc.nextInt();
		    kk=new BankMethodEncapsulation(id,Name , Balance, Number);
		
		
	}
	    else if(key==2) {
	    	
		    System.out.println("Update the balance");
		    int Balance = sc.nextInt();
		    System.out.println("Enter the pin: ");
		    int pin =sc.nextInt();
		    kk.setBalance(Balance,pin);
		  
	    }else if(key==4) {
	    	System.out.println(kk);
	    }else if(key==5) {
	    	iswork=false;
	    	System.out.println("Thank you!!!!!");
	    }else if(key==3) {
	    	 System.out.println("Enter Withdrawl the balance");
			    int Balance = sc.nextInt();
			    System.out.println("Enter the pin: ");
			    int pin =sc.nextInt();
			   int total=kk.getBalance()-Balance;
			    kk.setBalance(total,pin);
	    }
	    
	    else {
	    	System.out.println("inc crt key");
	    }
	

}
	
	}
	
}