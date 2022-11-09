package p1;
public class Display1 implements Runnable {
	public void run()
	{
		for(int i=200;i<=210;i++)
		{
			System.err.println("i :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
