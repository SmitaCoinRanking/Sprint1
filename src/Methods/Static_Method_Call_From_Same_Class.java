package Methods;

public class Static_Method_Call_From_Same_Class {
	public static void main(String[] args) {//Main method body open
		//We are calling static regular method from same class
		moneyTransfer();
		recharge();
		electricity();
		
	}//Main method body close
	
	public static void moneyTransfer() {//Regular method 1
		System.out.println("Money trasfer to sister");
		System.out.println("Money transfer to brother");
	    System.out.println("Money Transfer");		
	    
	}// regular method body close
	
	public static void recharge() {//Regular method 2
		
		System.out.println("Did Recharge for TV");
		System.out.println("Did Recharge for Mobile");
		System.out.println("Did Recharge for Electricity");
		
	}//Regular method 2 body close
	
	public static void electricity() {//Regular method 3
		System.out.println("Phone bill");
		System.out.println("Ac Bill");
		System.out.println("Cooler bill is paid");
	}//Regular method 3 body close
}
