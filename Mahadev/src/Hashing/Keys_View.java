package Hashing;
//import java.util.Enumeration;
//import java.util.Hashtable;

public class Keys_View {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	     Hashtable h = new Hashtable();
//	        h.put("1", "One");
//	        h.put("2", "Two");
//	        h.put("3", "Three");
//
//	        Enumeration e = h.keys();
//	        while(e.hasMoreElements()) {
//	            System.out.println(e.nextElement());
//
//	        }
//
//	}
//	 public static void main(String[]args)
//	    {
//	        int a[]={3,4,5,67,89};
//	        int t=89;
//	      
//	     int ans=  Binary(a,t);
//	        System.out.println(ans);
//	    }
//	        static int Binary(int []a,int t)
//	        {
//	            int s=0;
//	            int e=a.length-1;
//	           
//	            while(s<=e)
//	            {
//	            	 int m=s+(e-s)/2;
//	                
//	                if(t<a[m])
//	                {
//	                    e=m-1;
//	                }
//	                else if(a[m]<t) {
//	                    s=m+1;
//	                }
//	                else
//	                {
//	                	System.out.println("target is at index" );
//	                    return m;
//	                }
//	              
//	            }
//	            return -1;
////	            System.out.println("target not found");
//	        }
	 public static void main(String[]args)
	    {
		 
	        int a[]={1,2,43,2,56,45};
	        int t=43;
	       int ans= LinearS(a,t);
	        System.out.println("target is at index"  +"   "  +ans);
	    }
	    static int LinearS(int a[],int t)
	    {
	    	
	        for(int i=0;i<a.length;i++)
	        {
	            if(t==a[i])
	            {
	                
	                return i ;
	            }
	        }
	        // System.out.println("target not found"  );
	        
	        return -1 ;
	    }
}
