package Day3;

import java.util.Arrays;

public class kthLargestElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {16,2,3,8};
		
		int n = arr.length;
		int k=1;
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-k]);
		}

}
