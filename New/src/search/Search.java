package search;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		int [] a= {5,2,12,1,25,19};int k;
		int min=a[0];int max=a[0];
//		for(int i=0;i<a.length/2;i++)
//		{
//			k=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=k;
//			
//		}
for(int i=1;i<a.length;i++)
{
if(a[i]<min)
	min=a[i];
}
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
	max=a[i];
}
for(int i=0;i<a.length;i++)
{
	if(a[i]==2)
	{
		a[i]=5;
	}
	

}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);}
//System.out.println(min + ""  + '\n'+  max);
	}

}
