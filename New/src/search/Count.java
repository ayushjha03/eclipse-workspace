package search;

import java.util.Arrays;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,5,6,7,8,9};
	    int target =9;
	    
	    int ans =BinarySearch(a,9);
	    if(ans==-1)
	    {
	    	System.out.println("element not found");
	    }
	    else
	    	
	    System.out.println(ans);
	 		
		
	
	}
	
  static int BinarySearch(int []array,int target)
 
 	{
	  int s=0;int e=array.length-1;
	  
 	while(s<=e)
 	{
 		int m=s+(e-s)/2;
 		if(array[m]<target)
 		{
 			s=m+1;
 			
 		}
 		else if (array[m]>target)
 		{
 			e=m-1;
 		}
 		else if(array[m]==target)
 		{
 			return m;
 		}
 	}
	     return -1;      
	   }
	 
 	    
	}


