
package Shiv;
import java.util.Arrays;
public class ReturnString {

	public static void main(String[] args) {
		int []a= {3,5,2,6,4};
		int []b=MergeSort(a);
		System.out.println(Arrays.toString(b));
	}
	static int [] MergeSort(int []a)
	{
		if(a.length==1)
		{
			return a;
		}
		int m=a.length/2;

		int []left= MergeSort(Arrays.copyOfRange(a, 0, m));
		int []right= MergeSort(Arrays.copyOfRange(a, m, a.length));
		return merge(left,right);
	}
	static int []merge(int []b,int []c)
	{
		int []mix=new int[b.length+c.length];
		int i=0;int j=0;int k=0;
		while(i<b.length&& j<c.length)
		{
			if(b[i]<c[j])
			{
				mix[k]=b[i];
				i++;
			}
			else 
			{
				mix[k]=c[j];
				j++;
			}
			k++;
		}
		while(i<b.length)
		{
			mix[k]=b[i];
			i++;
			k++;
		}
		while(j<c.length)
		{
			mix[k]=c[j];
			j++;
			k++;
		}
		return mix;
	}
//	static void Swap(int []a ,int j,int b)
//	{
//		int temp=a[j];
//		a[j]=a[b];
//		a[b]=temp;
//	}

}
