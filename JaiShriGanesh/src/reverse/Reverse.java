package reverse;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner rev=new Scanner(System.in);
		int a=rev.nextInt();
		int b=0;
		for(int j=1;a!=0;j++) {
		int i=a%10;
		b=b*10+i;
		a=a/10;}
		
		

	}

}
