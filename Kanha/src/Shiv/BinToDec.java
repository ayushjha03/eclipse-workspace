package Shiv;
import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int bin=sc.nextInt();
		int sum=0;
		int n=0;
		for(int i=1;i<=bin;i++)
		{
			if(bin==0)
			{
				break;
			}else
		{
			int rem=bin%10;
			sum=(int)(sum+rem*Math.pow(2,n ));
			bin=bin/10;
			n++;
		}
		}
System.out.println(sum);
	}

}
