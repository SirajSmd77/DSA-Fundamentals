package binarySearch;

public class sqrt {

	
    public static int sqrt(int[] arr , int  x) {
    long start = 0;
    long end = x;
   
         
          while(start+1<end){  
              long mid = start+(end-start)/2;
              
              if(mid*mid==x) {
            	 return (int)mid;
              
              }if(mid*mid>x) {
                  end=mid;
                 
                  
              }else {
                  start=mid;
          
          }if(end*end==x) {
        	  return (int)end;
          }
          }
          return (int)start;
    }      
         

    public static void main(String[] args) {
	// TODO Auto-generated method stub
     int[] arr = {2,4,6,8,15,16,18,32,64,72};
      int x = 72;
       
     int sq = sqrt(arr,x);
     System.out.println(sq);
      
 }
}