package Day6;
import java.util.Scanner;


public class minMaxRecursion {
	static int FindMax(int arr[],int n)
	{
		if(n==1)
			return arr[0];
	    return Math.max(arr[n-1], FindMax(arr, n-1));
	}
	 static int FindMin(int arr[],int n)
	{
		 if(n==1)
				return arr[0];
		    return Math.min(arr[n-1], FindMin(arr, n-1));
	}
	public static void main(String[] args) {
           int arr[]= {-8,-7,-6,1,2,5,7,9};
	    int n,i;
	    n=arr.length;
	   
	    System.out.println("Minimum of the array is: "+FindMin(arr,n));
	   System.out.println("Maximum  the array is: "+FindMax(arr,n));
	   
	}

}


