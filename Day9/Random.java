package Day9;

public class Random {

	public static int partition(int[] arr,int l,int r) {
		int i = l - 1;
		int j = l;
		int p = arr[r];
		
		for(;j<r;j++) {
			if(arr[j]>p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
		return i;
		
	}
	
	public static void quickShort(int[] arr,int l,int r) {
		if(l>=r)return;
		int pivotindex = partition(arr,l,r);
		quickShort(arr,l,pivotindex - 1);
		quickShort(arr,pivotindex + 1,r);
		
	}
	
	public static int[] Shuffling(int[] arr) {
		
		Random rnd = new Random();
		for(int i = arr.length - 1; i>0; i--) {
			int index = rnd.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
					
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr = {5,7,8,3,15,13,23,7,4,8};
		int l = 0;
		int r = arr.length - 1;
		
		arr = Shuffling(arr);
		
		quickShort(arr,l,r);
		
		for(int i = 0;i<r;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
