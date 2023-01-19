package Arrays;

public class MultiDimentionalArray {//it is used for matrix representation 
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		//System.out.println(arr[1][1]);//40
		//System.out.println(arr[0][0]);//10
		System.out.println("************Print Entire Matrix***********");
		for(int i=0;i<=1;i++) {//outer for loop
			for(int j=0;j<=1;j++) {//Inner for loop
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	
		
	}

}
