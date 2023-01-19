package MockPractice;

public class StaticM_NonStaticMember {
	
	static int i =20;//Static variable
	int j= 50;// Non static global variable 
	public static void main(String[] args) {
		
		 System.out.println(i);
		 
		 
		 StaticM_NonStaticMember t = new StaticM_NonStaticMember();//object for Non Static method
		 System.out.println(t.j);
		 m1();//Static method call from same class
		 t.m2();//Non static method call from same class
		
	}
	
	public static void m1() {
		System.out.println("I am from static method");
		System.out.println("Bonjour tout le mond.....");
	}
	
	public void m2() {
		System.out.println("I am from non static method");
	}

}
