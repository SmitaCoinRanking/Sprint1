package Collections;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Smita");
		al.add(189598);
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(null);
		al.add("Smita");
		al.add("Madhuri");
		al.add(null);
		//al.add(args);
		//al.add(al);
		al.add(15.62878);
		System.out.println("******I need to print entire data inside the collecion******");
		System.out.println(al);
		//check the size
		System.out.println(al.size());
		//check whether it is empty
		System.out.println(al.isEmpty());//false
		//contain or not
		System.out.println(al.contains(100));//true
		//get the data of Particular index
		System.out.println(al.get(3));
		//print entire data
		System.out.println(al);//right shift operation
		//remove the data(left shift operation)
		al.remove(2);//left shift
		System.out.println(al);
	}

}
