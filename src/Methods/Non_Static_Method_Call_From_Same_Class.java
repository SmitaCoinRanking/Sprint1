package Methods;

public class Non_Static_Method_Call_From_Same_Class {
	public static void main(String[] args) {
		System.out.println("Main method started");
		Non_Static_Method_Call_From_Same_Class NT = new Non_Static_Method_Call_From_Same_Class();
		NT.T1();
		NT.T2();
	}
	public void T1() {
		System.out.println("I am from non static regular method from T1()");
		System.out.println("I love my India");
		System.out.println("Hello");
		
	}
	
	public void T2() {
		System.out.println("I am from non static regular method from T2()");
		System.out.println("I Love my sister");
		System.out.println("I love my Brother");
	}

}
