package Project; import java.util.Scanner; public class One { public static void main(String[] args) {
		
String[] countries = new String[5];
int[][] numbers= {     {5,    10,   15,   20},
		               {100,  150,  175,  200},
		               {9999, 8888, 7777, 6666},
		               {20254,98541,45213,10000},        };


int odd=0; int even=0;
for(int[] a:numbers)  { for(int b:a) { if(b%2!=0) odd+=b; else even+=b;     } }
	
System.out.println("The sum of the following odd numbers; ");
for(int[] a:numbers)  { for(int b:a) {  if(b%2!=0) System.out.print(b+"  ");  } }
System.out.println(); System.out.println("is equal to      -# "+odd+" #-");	

System.out.println(); System.out.println("---+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+---"); System.out.println();
	
System.out.println("and the sum of the following even numbers; ");
for(int[] a:numbers)  { for(int b:a) {  if(b%2==0) System.out.print(b+"  ");  } }
System.out.println(); System.out.println("is equal to      -# "+even+" #-");		
	
//Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array		
		




		
		
}}
