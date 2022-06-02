package Project;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// say whaaaaaa 


		Scanner inp = new Scanner (System.in);
		
		int a= inp.nextInt(), q=0; String prime="null", con="null";
		
		for (int b=2; b<a; b++) {
			
			if (q>2) con="confedfs"; else con="not condd";
			
			if(a%b==0) q+=1;
			if(a%b!=0)prime="a prime";
			else {prime="not a prime"; break;}        }
		

			System.out.println("the number entered is "+ prime+" and is.. "+con);
		
		
		
		
		
		
		
		
		
	}

}
