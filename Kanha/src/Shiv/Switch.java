package Shiv;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
int n=sc.nextInt();

switch(n)
{
case 1:
{
	int r= sc.nextInt();
	double area=Math.PI*r*r;
	System.out.println(area);
	break;
}
case 2:
{
	int l=sc.nextInt();
	int b=sc.nextInt();
	double area=(l*b);
	System.out.println(area);
	break;
}
default:
	System.out.println("please choose correct choice");
	break;
}

	}

}
