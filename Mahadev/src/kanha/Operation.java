package kanha;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int j= sc.nextInt();
	int [][]array= new int[i][j];

	for(int k=0;k<array.length;k++)
	{
for(int l=0;l<array[k].length;l++)
{
	array[k][l]=sc.nextInt();
}
	}

	for(int k=0;k<array.length;k++)
		
	{
		for(int l=0;l<array[k].length;l++)
		System.out.println(array[k][l]);
	}
}
}