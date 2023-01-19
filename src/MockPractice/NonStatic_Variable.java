package MockPractice;

public class NonStatic_Variable {
	
	int i=50;//Non static global variable.
	
	public static void main(String[] args) {
		
		//Create an object
		NonStatic_Variable nt = new NonStatic_Variable();
		
		System.out.println("******************Non Static variable******************");
	    System.out.println(nt.i);
	}

}
