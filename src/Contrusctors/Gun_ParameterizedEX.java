package Contrusctors;

public class Gun_ParameterizedEX {//Bussines logic class
	String gunName;
	int noOfBulets;
	
	//Constructor
	public Gun_ParameterizedEX(String gunName,int noOfBulets) {
		this.gunName =gunName;
		this.noOfBulets=noOfBulets;
	}
	
	//Non static method
	public void shoot() {
		for(int i=1;i<=noOfBulets;i++) {
			System.out.println("***********This is parametrised constructor****************");
			System.out.println("Dishkewwwwwwwww");
		}
	}
}
