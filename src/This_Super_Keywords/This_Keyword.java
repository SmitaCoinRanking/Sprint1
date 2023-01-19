package This_Super_Keywords;

public class This_Keyword {//BLC
	
		int a= 10;//Global Variable 
		public void test(){
			int b=20;//Local variable
			System.out.println(b);
			//Now i want to print global variable from same class
			System.out.println(this.a);
		}

}
