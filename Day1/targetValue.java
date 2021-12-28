package binarySearch;

public class targetValue {

	
	public static int targetValue(int[] arr , int target) {
		
	   int	start = 0;
	   int end = arr.length-1;
	   
		if(arr.length==0) {
			return -1;
		}
		
		while(start<=end) {
		 int	mid= start + (end-start)/2;
		 
		 if(arr[mid]==target) {
			 System.out.println(mid);
			 break;
		 
		}if (arr[mid]>target) {
			 end = mid -1;
		 }if(arr[mid]<target) {
			 start=mid+1;
		 } 
	}
        return -1;
}
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] arr = {1,2,3,4,5,6};
	int target = 5;
	
	 targetValue(arr, target);
	

  }
}
