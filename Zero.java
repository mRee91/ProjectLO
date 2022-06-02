package Project;

public class Zero {

	public static void main(String[] args) {


		String[] countries = new String[5];
		int[][] numbers= {     {5,    10,   15,   20},
				               {100,  150,  175,  200},
				               {9999, 8888, 7777, 6666},
				               {20254,98541,45213,10000},        };


		int odd=0; int even=0;
	
		for(int[] a:numbers)  { 
			for(int b:a) { 
				if(b%2!=0) odd+=b; 
				else even+=b;     } }
			
		System.out.println("The sum of the odd numbers is "+odd+".");	

		System.out.println(); System.out.println("   ---+-+-+-+-+-+-+-+-+-+-+-+-+---"); System.out.println();
			
		System.out.println("The sum of the even numbers is "+even+".");	

	}

}


