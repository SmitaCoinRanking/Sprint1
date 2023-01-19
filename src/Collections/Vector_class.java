package Collections;

import java.util.Vector;

public class Vector_class {
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Smita");
		v.add(100);
		v.add('Z');
		v.add(null);
	    v.add(null);
	    //check the capacity
	    System.out.println(v.capacity());//double like 10
	    //print all data
	    System.out.println(v);
	    //size
	    System.out.println(v.size());
	    //isempty
	    System.out.println(v.isEmpty());//false
	    //get the particular data
	    System.out.println(v.get(0));//smita
	    //insert data (rightshift)
	    v.add(0,150);
	    System.out.println(v);
	    //remove (left shift)
	    v.remove(0);
	    System.out.println(v);
	    
	    
	}

}
