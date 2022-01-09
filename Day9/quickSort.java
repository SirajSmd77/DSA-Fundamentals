package Day9;

public class quickSort {
	 static int partition(int array[], int start, int end) {
	        int i = start - 1;
	        int j = start;
	        int pivot = array[end]; 

	        for (; j < end; j++) {
	            if (array[j] < pivot) {
	                ++i;
	              
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	        // swap(a[i + 1], a[e]);
	        int tmp = array[i + 1];
	        array[i + 1] = array[end];
	        array[end] = tmp;
	        return i + 1;
	    }

	    static void quicksort(int array[], int start, int end) {
	        if (start >= end)
	            return;
	        int pivot_idx = partition(array, start, end);
	        quicksort(array, start, pivot_idx - 1);
	        quicksort(array, pivot_idx + 1, end);

	    }

		public static void main(String[] args) {
			
			 int array[] = { 10, -1, -9, 2, 4, 5, 6, 8, 10, 11, 15 };
		        quicksort(array, 0, array.length - 1);

		        
		        for (int i = 0; i < array.length; i++) {
		            System.out.println(array[i]);
		        }
		} 

	}

