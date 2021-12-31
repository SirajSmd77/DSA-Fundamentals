package Day5;

public class waveMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,2,3,4},
			           {5,6,7,8},
	                   {9,10,11,12},
	                   {13,14,15,16}
	             };
		
		int n =arr.length;
		int m = arr[0].length;
		
	
			for(int j=0; j<m; j++) {
				if(j%2==0) {
					for(int i=0; i<n; i++) {
						System.out.println(arr[i][j]);
					}
				}else {
					for(int i=arr.length-1; i>=0; i--) {
						System.out.println(arr[i][j]);
					}
				}
				
				
				
		}
		
		
		
		
	}

}
