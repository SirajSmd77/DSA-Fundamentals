package Day7;
import java.util.Scanner;
public class BinarySearchRecursion {
	public static int binarySearch(int[] arr, int item, int start, int end) {
        int mid= start + (end-start)/2;
        while(start<=end) {
            if(arr[mid]==item) 
            	return mid;
            else if(arr[mid]>item)
            return binarySearch
            (arr,item,start,mid-1);
            else return binarySearch(arr,item,mid+1,end);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
       System.out.println("Enter array elements");
       for(int i=0;i<n;i++) 
    	  arr[i]=sc.nextInt();
       
       System.out.println("Enter element to be searched");
       int item=sc.nextInt();
       
       int index=binarySearch(arr, item, 0, n-1);
       
       if(index==-1) System.out.println("Item not found");
       
       else System.out.println("Item found at index "+index);
    }

}

