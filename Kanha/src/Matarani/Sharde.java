package Matarani;

public class Sharde {

//	public static void main(String[] args) {
//
//	int [] a= {5,4,3,2,1};
//		Selection(a);
//		for(int j=0;j<a.length;j++)
//		{
//			System.out.println(a[j]);
//		}
//	
//	}
//	static void  Selection(int []a)
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			int s=0;
//			int l=a.length-i-1;
//			int max= Max(a, s, l);
//			 Swap( a, max, l);
//			 
//		}
//		
//	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
//	 static int Max(int []a,int s,int l)
//	 {
//		 int max=s;
//		 for(int k=s;k<=l;k++)
//		 {
//			 if(a[k]>a[max])
//			 {
//				 max=k;
//			 }
//		 }
//		 return max;
//	 }
//	 static void Swap(int [] a,int max,int l)
//	 {
//		 int temp= a[max];
//		 a[max]=a[l];
//		 a[l]=temp;
//	 }
	 public static void main(String[]args)
	    {
	        int a[]={10,99,34,56,3,88,125};
	        int t=3;
	        // Scanner b= new Scanner(System.in);
	        // for(int i=0;i<5;i++)
	        // {
	        //      a[i]= b.nextInt();
	        //     // 
	        // }
	        Binary(a,t);
//	        System.out.println(ans);
	    }
	        static void Binary(int []a,int t)
	        {
	            int s=0;
	            int e=a.length-1;
	            int m=s+(e-s)/2;
	            while(s<=e)
	            {
	                
	                if(a[m]==t)
	                {
	                	System.out.println("target is at index" + m);
	                    
	                }
	                else if(t<a[m])
	                {
	                    e=m-1;
	                }
	                else{
	                    s=m+1;
	                }
	              
	            }
//	            System.out.println("target not found");
	        }
	        // for(int i=0;i<5;i++)
	        // {
	        //     //  a[i]= sc.nextInt();
	        //      System.out.println(a[i]);
	            

	        // }
	       
	        // int a=5;
	        // int b=10;
	        // System.out.println(a+b);
	    
	

	}