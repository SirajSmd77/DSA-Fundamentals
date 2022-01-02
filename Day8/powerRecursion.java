package Day8;
import java.util.Scanner;
public class powerRecursion {

	 public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	     System.out.println("Enter base");
	     int base=sc.nextInt();
	     System.out.println("Enter exponent");
	     int exponent=sc.nextInt();
	     System.out.println("Power("+base+"^"+exponent+") = "+power(base,exponent));
	 
	    	}
	 
	 static int power(int b,int pow) {
	 if(pow==0)
	    return 1;
	 else 
	     return (b*power(b,pow-1)); 
	 }

}