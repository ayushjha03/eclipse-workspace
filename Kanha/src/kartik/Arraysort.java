package kartik;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[]args)
    {
        int [] a={5,4,3,2,1};
        // int t=43;
        Selection(a);
        for(int k=0;k<a.length;k++)
        {
            System.out.println("sorted array is"+ a[k]);
        }
    }
    static void Selection(int []a)
    {
        if(a.length<=1)
        {
            System.out.println("array is not sorted");
        }
//      else 
       for(int i=0;i<a.length;i++)
       {
           int s=0;
           int e= a.length-i-1;
           int getMax= Maximum(int []a,int s, int e) ;
//            int max=0;
//            for(int p=0;p<e;p++){
//                max=a[p];
//                if(a[p+1]>a[p])
//                {
//                    max=a[p+1];
//                }
//                }
//            int temp=a[max];
//            a[max]=a[e];
//            a[e]=temp;
			
            Swap(int[]a,int e,int getMax);
        }}
        static void Swap(int []a, int e,int getMax)
        {
            int temp=a[getMax];
            a[getMax]=a[e];
            a[e]=temp;
        }
        static int Maximum(int []a,int s,int e)
        {
        	int max=0;
            for(int i=0;i<=e;i++){
             
            if(a[max]<a[i])
            {
                max=i;;
            }
            }
            return max;
        }

}
