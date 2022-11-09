package p1;

public class Display3 implements Runnable {
	
	public void run()
	{
		for(int i=300;i<=310;i++)
		{
			System.err.println("K :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
