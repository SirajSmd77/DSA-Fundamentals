package Day6;
import java.util.Scanner;


public class FibonacciRecursion {
	static int first=1, second=1, third=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         third= first + second;    
	         first = second;    
	         second = third;    
	         System.out.print(" "+third);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){ 
		 Scanner cs=new Scanner(System.in);
			System.out.println("Enter count");

		 int count=cs.nextInt();
	
	  System.out.print(first+" "+second);//printing 0 and 1    
	  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  

}

