
class Hello implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
	  	    	   System.out.println("Hello");
	  	    	   Thread.sleep(5000);
	  	       }catch(Exception e) {
	  	    	   
	  	       }
		}
	}	
}
public class Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Thread t1=new Thread(new Hello());
	        t1.start();
	        
	        try {
	  	    	   Thread.sleep(200);
	  	       }catch(Exception e) {
	  	    	   
	  	       }
	        
	        for(int i=0;i<5;i++)
			{
	        	 try{
	  	    	   System.out.println("main Hello");
	  	    	   Thread.sleep(2000);
	  	       }catch(Exception e) {
	  	    	   
	  	       }
			}

	}

}
