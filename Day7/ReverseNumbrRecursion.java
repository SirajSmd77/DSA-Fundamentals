package Day7;
import java.util.Scanner;

public class ReverseNumbrRecursion {

	 static void reverse(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverse(number/10);
	       }
	   }
	   public static void main(String args[]) {
		int num=0;
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print("Reverse of the number is:");
		reverse(num);

   }

}
