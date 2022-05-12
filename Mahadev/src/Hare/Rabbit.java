package Hare;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
	

		   
		    
		        Thread tortoise = new Tortoise();
		        tortoise.start();
		        for(int a=1;a<31;a++)
		        {

		            System.out.println("Hare distance= "+(a));
		        }

		        System.out.println("!!!!!!!!!!!!!!!HARE Went To SLEEP!!!!!!!!!!!!!!!!!!!!!");

		        try
		        {
		            Thread.sleep(3000);
		        }
		        catch(InterruptedException ie)
		        {

		        }

		        System.out.println("!!!!!!!!!!!!!!Hare started the race again!!!!!!!!!!!!!!!!");

		        for(int b=51;b<61;b++)
		            System.out.println("HARE Distance=  "+(b));
		        System.out.println("!!!!!!!!!!!!!!!!!!!!HARE HAS COMPLETED THE  RACE !!!!!!!!!!!!!!!!!!!");


		    }
		}
		class Tortoise extends Thread
		{
		    public void run()
		    {
		        for(int c=1;c<61;c++)
		        {
		            System.out.println("TORTOISE Distance= "+c);
		        }
		        System.out.println("!!!!!!!!!!!!!!!!TORTOISE Won the  RACE !!!!!!!!!!!!!!!!!!!!!");

		    }

		}


	


