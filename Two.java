package Project; import java.util.Scanner; public class Two { public static void main(String[] args) {
Scanner inp= new Scanner(System.in);	
	
int odd=0; int even=0;
int[][] numbers= new int[4][4];
   for(int x=0; x<numbers.length; x++) {
   for(int y=0; y<numbers[x].length; y++) {System.out.print("value of numbers["+x+"]["+y+"] :");	
	numbers[x][y] = inp.nextInt();} System.out.println();}
   for(int[] a:numbers)  { for(int b:a) { if(b%2!=0) odd+=b; else even+=b;     } }
    
System.out.println(); System.out.println("---+-+-+-+-+-+-+-+-+++++++++++++++-+-+-+-+-+-+-+-+---"); System.out.println();

System.out.println(" | O |  The sum of the following odd numbers; "); System.out.print(" | D |  ");
   for(int[] a:numbers)  { for(int b:a) {  if(b%2!=0) System.out.print(b+"  ");  } }
System.out.println(); System.out.println(" | D |  is equal to      -=# "+odd+" #=-");	

System.out.println(); System.out.println("---+-+-+-+-+-+-+-+-+++++++++++++++-+-+-+-+-+-+-+-+---"); System.out.println();
	
System.out.println(" | E |  and the sum of the following even numbers; "); System.out.print(" | V |  ");
   for(int[] a:numbers)  { for(int b:a) {  if(b%2==0) System.out.print(b+"  ");  } }
System.out.println(); System.out.println(" | N |  is equal to      -=# "+even+" #=-");		







	
	
	
	
	
	
}}
