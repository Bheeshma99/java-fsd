
class B{
	static int count=0;
	public synchronized void   increment ()
	{
		count ++;
	}
}
public class  WithSynchrnization{

	public static void main(String[] args) throws Exception {

		B obj=new B();
      Thread t1=new Thread(new Runnable()
    		  {
    	  public void run()
    	  {
    		  for(int i=0;i<1000;i++)
    			{
    	
    	   		  obj.increment();
    			}
    	  }
    		  });
      
      Thread t2=new Thread(new Runnable()
	  {
    	  public void run()
    	  {
    		  for(int i=0;i<1000;i++)
    			{
    			 
    	   		  obj.increment();
    			}
    	  }
	  });
      
      
      t1.start();
      t2.start();
      
      
      t1.join();
      t2.join();
      System.out.println(B.count);
 }

}

