package day12;

public class ConstructorInJava{
	public int id;
	public String  name;
	ConstructorInJava (int id, String name){
		this.id= id;
		this.name=name;
		
	}
	
	public int getid() {
	return id;
	}
	
	public String getname() {
	return name;
	}
	
	public static void main (String ar[]) {
		ConstructorInJava sc = new ConstructorInJava(8,"jay");
		System.out.println( sc.getname());
		
		
		
	}
		
		



}
