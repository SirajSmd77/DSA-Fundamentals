package Day5;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] arr = {{1,2,3,4},
			       {5,6,7,8},
	               {9,10,11,12},
	               {13,14,15,16}
	             };
	
		int T,B,L,R,dir;
	    T=0;
	    B=arr.length-1;
	    L=0;
	    R=arr[0].length-1;
	    dir=0;
	    int i;
	    
	    while(T<=B && L<=R)
	    {
	        if(dir==0)
	        {
	            for(i=L;i<=R;i++)
	                System.out.println(arr[T][i]);
	            T++;
	        }
	        else if(dir==1)
	        {
	            for(i=T;i<=B;i++)
	            	System.out.println(arr[i][R]);
	            R--;
	        }
	        else if(dir==2)
	        {
	            for(i=R;i>=L;i--)
	            	System.out.println(arr[B][i]);
	            B--;
	        }
	        else if(dir==3)
	        {
	            for(i=B;i>=T;i--)
	            	System.out.println(arr[i][L]);
	            L++;
	        }
	        dir=(dir+1)%4;
	    }
	    System.out.println(arr);
	}
		}
	 
