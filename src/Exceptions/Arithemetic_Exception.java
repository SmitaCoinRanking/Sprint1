package Exceptions;

public class Arithemetic_Exception {
	public static void main(String[] args) {
		 int a = 1;
		 int b=0;
		 try {
			 int c=a/b;//Risky code
			 System.out.println(c); 
		 }
		 catch (Throwable smita) {
			System.out.println("Exception is handled....");		
			}
		System.out.println("Smita....");
	}

}
