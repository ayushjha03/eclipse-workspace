package leap;
import java.util.Arrays;
import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner ab =new Scanner(System.in);
		int m=ab.nextInt();
		int n=ab.nextInt();
		
		int o;
		while(m!=0)
		{
			 o=  m;
			m=n%m;
			n=o;
		
			
		}
		int hcf = n;
		float lcm = (m*n)/hcf;
		
		System.out.println(  hcf);
		System.out.println(lcm);
	

	}

}
