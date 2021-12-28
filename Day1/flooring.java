package binarySearch;

public class flooring {

	public static int flooring(int[] arr , int target) {
	   int	start = 0;
	   int end = arr.length-1;
	   
		
		while(start<=end) {
		 int	mid= start + (end-start)/2;
		 
		 if(arr[mid]==target) {
			 return mid;
			 
		 }
		 
	      if (arr[mid]>target) {
			 end = mid -1;
		 }if(arr[mid]<target) {
			 start=mid+1;
		 }
	}
		/*flooring*/
	  return arr[end]; 	

	}
	
	public static int ceiling(int[] arr , int target) {
		   int	start = 0;
		   int end = arr.length-1;
		   
			
			while(start<=end) {
			 int	mid= start + (end-start)/2;
			 
			 if(arr[mid]==target) {
				 return mid;
				 
			 }
			 
		      if (arr[mid]>target) {
				 end = mid -1;
			 }if(arr[mid]<target) {
				 start=mid+1;
			 }
		}
			/*Ceiling*/
		return arr[start]; 	

		}
    public static void main(String[] args) {

    	
   // if value of n is not present 	
	int[] arr = {1,2,4,9,12,16,20};
	
	int target =11 ;
	
	int f =  flooring(arr , target);
	int c = ceiling(arr,target);
	
	System.out.println(f);
	System.out.println(c);
	
	}
}