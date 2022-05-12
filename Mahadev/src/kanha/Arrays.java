package kanha;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int []a= new int[5];
		for(int i=0;i< a.length;i++)
		{
			a[i]=in.nextInt();
			
		}
		
		
	for(int num : a)
	{
		System.out.println(num + " ");
	}
		

	}

}
