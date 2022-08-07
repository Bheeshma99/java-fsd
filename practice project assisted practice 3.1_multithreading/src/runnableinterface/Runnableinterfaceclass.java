package runnableinterface;
class Hello implements Runnable
{
	public void run()
	{
		 System.out.println("Hello");
	}	
}
public class Runnableinterfaceclass {

	public static void main(String[] args) {
		
//		Hello obj=new Hello();
//        Thread t1=new Thread(obj);
//        t1.start();
        
//        Runnable obj=new Hello();
//        Thread t1=new Thread(obj);
//        t1.start();
		
		
		
	        Thread t1=new Thread(new Hello());
	        t1.start();
	     
	}

}
