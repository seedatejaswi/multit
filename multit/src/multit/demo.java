package multit;

class a extends Thread
{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.print("class a");
			}
		}
		
	}
}
class b extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("how are you");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.print("class b");
			}
		}
	}
	
}
public class demo {
	public static void main(String args[])
	{
		a a1=new a();
		b b1=new b();
		
		a1.start();
		b1.start();
	}

}
