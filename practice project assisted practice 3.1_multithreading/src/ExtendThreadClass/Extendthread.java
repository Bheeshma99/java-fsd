package ExtendThreadClass;
class Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
		}
	}	
}

public class Extendthread {

	public static void main(String[] args) {
		
         Hi t1=new Hi();
         t1.start();
	}

}
