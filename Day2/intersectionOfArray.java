package binarySearch;

public class intersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] = {2,3,6,7,9,11,14};
	int arr2[] = {4,6,8,9,12,14,15};
	
	
	int i=0;
	int j=0;
	while( i<arr.length && j<arr2.length) {
		
		if(arr[i]==arr2[j]) {
			System.out.println(arr[i]);
			i++;
			j--;
			
		}else if(arr[i]>arr2[j]) {
			j++;
		}else {
			i++;
		}
		
	}
	
	}

}
