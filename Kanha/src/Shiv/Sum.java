package Shiv;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int s1=0;
		int s2=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				s1=s1+i;
			}
			else
			{
				s2=s2+i;
			}
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
