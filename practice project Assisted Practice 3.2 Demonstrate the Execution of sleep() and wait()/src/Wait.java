class B
{
	static int num;
	void set(int num)
	{
		this.num=num;
		System.out.println("set num:"+num);
	}
	void get ()
	{
		System.out.println("get num:"+num);
	}
}
class producer implements Runnable
{  int i=0;
B b=new B();
	public void run()
	{
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
			b.set(i++);
		}
	}
}
class consumer implements Runnable
{ 
    B b=new B();
	public void run()
	{
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
			b.get();
		}
	}
}
public class Wait {

	public static void main(String[] args) {
	
producer p=new producer();
consumer s=new consumer();
Thread t1=new Thread (p);
Thread t2=new Thread (s);
t1.start();
t2.start();
	}

}
