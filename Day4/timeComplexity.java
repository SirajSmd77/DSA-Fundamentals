package Day4;

public class timeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("1");
   int  n= 2;
// TimeComplexity O(n)
  for (int i = 0; i < n; ++i) {                
        System.out.println("Geekster");
        }
  
  System.out.println("2");
    int i, j;
 
 // TimeComplexity O(n^2)
  for ( i = 1; i <=n; i++) {
      for (j = 1; j <=n; j++) {
    	  System.out.println("GeeksforGeeks");
      }
  }
  
  
  System.out.println("3");
  int m=5;
  // TimeComplexity O(nlogN)
  for (i = 1; i <= m; i++){
      for (j = 1; j <= Math.log(i); j++)
      {
    	  System.out.println("GeeksforGeeks");
      }
  }    
  
  
  System.out.println("4");
  //TimeComplexity (logN)
  int s= 5;
  for ( i = 1; i < s; i *= 2) {
	  System.out.println("Geekster");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

}
