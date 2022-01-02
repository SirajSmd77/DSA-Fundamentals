package Day8;
import java.util.Scanner;

public class gcdRecursion {

 public static int GCD(int a, int b) {
         
         if (a == b) {
             return a;

         } else if (a == 0) {
              return b;

         } else if (b == 0) {
              return a;
 
         } else if (a > b) {
              return GCD(a % b, b);
         } else {
              return GCD(a, b % a);
         }
   }

   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a:");
	     int a=sc.nextInt();
	     System.out.println("Enter b:");
	     int b=sc.nextInt();

         

         System.out.println("result:"+GCD(a, b));

   }

}
