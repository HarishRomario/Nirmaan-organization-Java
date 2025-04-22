package day9;


public class Empdetails {
    String name;
	long PhoneNo;
	double salary;
	public void employee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee PhoneNo: "+PhoneNo);
		System.out.println("Employee salary: "+salary);
	}
	
public static void main(String[] arg) { 
	Empdetails emp1=new Empdetails();
	emp1.name="john cena";
	emp1.PhoneNo=9090876543l;
	emp1.salary=3000;
	emp1.employee();
	
	Empdetails emp2=new Empdetails();
		emp2.name="Randy Ortan";
		emp2.PhoneNo=990878765l;
		emp2.salary=1800;
		emp2.employee();
	Empdetails emp3=new Empdetails();
		emp3.name="roman";
		emp3.PhoneNo=912087565l;
		emp3.salary=4520;
		emp3.employee();
	
		
		
}
	

}
