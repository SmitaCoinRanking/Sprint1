package Collections;

import java.util.LinkedList;

public class Linked_List_class {
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("Velocity");
		l.add(100);
		l.add('A');
		l.add(null);
		l.add(null);
		//print all the data
		System.out.println(l);
		System.out.println(l.size());//5
		//contains
		System.out.println(l.contains(null));//true
		//get the data
		System.out.println(l.get(2));//A
		System.out.println(l);
		//insertion(right shift)
		l.add(2,"Smita");
		System.out.println(l);
		//left shift
		l.remove(2);
		System.out.println(l);
		}

}
