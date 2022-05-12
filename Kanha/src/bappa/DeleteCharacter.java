package bappa;
import java.util.Scanner;

public class DeleteCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

	String s1=sc.nextLine();
		String s="";
		for(int i= 0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s=s+s1.charAt(i);
			}
		}
System.out.println(s);
System.out.println();
String k="";

for(int j=3;j<=7;j++)
{
	char ch= s1.charAt(j);
	k=k+ch;
}
System.out.println(k);
	}

}
