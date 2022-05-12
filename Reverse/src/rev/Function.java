package rev;

import java.util.Scanner;

public class Function {
	
	public static void main(String[] args) {
 Scanner sc= new Scanner (System.in);
int n = sc.nextInt();
boolean ans= isPrime(n);
System.out.println(ans);


	}

	static boolean isPrime (int n)
	{
		if(n<=1)
			{
			return false;
			}
		for(int c= 2; c*c<=n; c++)
		{
			if(n%c==0)
				{
				return false;
				
				}
		}
			if(c*c>n)
			{
				return true;
			}
			return false;
			
		
	}
	
}
 