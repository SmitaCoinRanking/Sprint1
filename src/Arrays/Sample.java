package Arrays;

public class Sample {
	public static void main(String[] args) {
		String ar[]=new String[5];
		ar[0]="Smita";
		ar[1]="Madhuri";
		ar[2]="Manoj";
		ar[3]="AAI";
		ar[4]="BABA";
		//ar[5]="ABC";
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		//System.out.println(ar[5]);//there is no data but still we are trying to fetch so we will get ArrayIndexOutOfBondExeption(AIOOBE)
	}

}
