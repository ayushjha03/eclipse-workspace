package lakshmi;
import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//int m=sc.nextInt();
//int n= sc.nextInt();
int [][] arr= {
		{1,3,4},
		{2,5,6},
		{7,8,9}
};
int sum=0;
for(int i= 0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		if(i==j)
		{
		sum=sum+arr[i][j];
		
		}
		else if(i!=j)
		{
			sum=sum+arr[i][j];
		}
	}
}
System.out.println(sum);

	}

}
