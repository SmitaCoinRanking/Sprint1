package Condiional_Statement;

public class If_Else_Ladder {
	public static void main(String[] args) {
		int marks =100;
		if(marks>=65) {
			System.out.println("Pass with Distinction");
		}
		else if(marks>=50) {
			System.out.println("pass with 1st class");
		}
		else if(marks>=40) {
			System.out.println("pass with 2nd class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
