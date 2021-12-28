package binarySearch;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,16,17,18,2,3};
		int count=0;
	   int ct = RotationCount(arr , count);	
		System.out.println(ct);  

	}
	
	public static int RotationCount(int[] arr, int count) {
		
		int min =arr[0];
	    int	min_index=-1;
	    int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(min>arr[i]) {
				min=arr[i];
				min_index=i;
			}
			
		}
		
		return min_index;
	}

}
