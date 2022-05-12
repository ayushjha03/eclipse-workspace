package leap;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		        Scanner sc= new Scanner(System.in);
		        String s=sc.nextLine();
		        String k="";
		        for(int i= 0;i<s.length();i++)
		        {
		        char ch=s.charAt(i);
		        if(ch>=65&&ch<=90)
		        {
		        	ch= (char)((char)ch+32);
		        	k=k+ch;
		        	
		        }
		        else {
		        	k=k+ch;
		        
		        }
		        }
		        System.out.println(k);
		   
	}

}
