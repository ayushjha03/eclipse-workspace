package lakshmi;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();int dig=0;
		for(int i=n+1;n<m;i++)
		{
			int y=i;
			int k=0;
			while(y!=0)
			{y=y/10;
			k++;
				
			}
			while(y!=0)
			{
			int r=y%10;
			dig=(int)(dig+Math.pow(r, k));
			y=y/10;
			}
			if(dig==y)
			{
				System.out.println(dig);
			}}
		
		

	}}


