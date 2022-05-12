package Shiv;
import java.util.Arrays;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		String s=s1+s2;
//		System.out.println(s);
//        String k = "";
//        for(int i=s.length()-1;i>=0;i--)
//        {
//        	char c= s.charAt(i);
//        	k=k+c;
//        }
//System.out.println(k);
//String m=sc.nextLine();
//
//for(int j=0;j<=m.length();j++)
//{
//	char ch=m.charAt(j);
//	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
//	{
//		System.out.println(ch);
//	}
//}
//	}
		int []a= {5,4,3,2,1};
		Insertion(a);
		System.out.println(Arrays.toString(a));
	}
	static void Insertion(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					Swap(a,j,j-1);
				}
				else
					break;
			}
		}
	}
	static void Swap(int []a ,int j,int b)
	{
//		int temp=j;
//		j=b;
//		b=temp;
		int temp=a[j];
		a[j]=a[b];
		a[b]=temp;
	}
}
