package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayClassCollection {
	

	public static void main(String[] args) {
		List<Object> fu = new ArrayList<>();
		fu.add(13);
		fu.add("gpmuthu");
		fu.add(true);
		fu.addFirst(201);
		fu.addLast(112);
		fu.contains(fu);
		fu.get(3);
		fu.getFirst();
		fu.getLast();
		fu.remove(0);
		System.out.println("fn");
		List<Integer> fu1= new ArrayList<>();
		fu1.add(80);
		fu1.add(77);
		fu1.add(88);
		fu1.add(33);
		fu1.add(22);
		System.out.println(fu1);
		Collections.sort(fu1);
		System.out.println(fu1);
;
		
		
	

	}

}
