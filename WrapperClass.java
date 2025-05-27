package DAY21;

public class WrapperClass {
	
	public void unbox() {
		Integer num=10;
		int num1 = num;
		System.out.println(num1);
		Float digit=4.5f;
		float digit3=digit;
		System.out.println(digit3);
		Double d1=3.7788990066;
		double d=d1;
		System.out.println(d);
		Boolean job=false;
		boolean job2= job;
		System.out.println(job2);
		Byte age=99;
		byte age4=age;
		System.out.println(age4);
		Short s1=8000;
		short s=s1;
		System.out.println(s1);
	
		
	}
	
	public void Autoboxing() {
		int num1=10;
		Integer num=num1;
		System.out.println(num1);
		float digit=4.5f;
		Float digit3=digit;
		System.out.println("digit3");
		double d1=3.7788990066;
		Double d=d1;
		System.out.println(d);
		boolean job =false;
		Boolean job2 =job;
		System.out.println(job2);
		byte age=99;
		Byte age2=age;
		System.out.println(age2);
		short s=8000;
		Short s1=s;
		System.out.println(s1);
	}
 
	public static void main(String[] args) {
		WrapperClass s2= new WrapperClass();
		s2.unbox();
		s2.Autoboxing();
		
		
		
	}

}
