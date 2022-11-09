package p1;

public class Display2 implements Runnable {
	
	public void run()
	{
		for(int i=100;i<=110;i++)
		{
			System.out.println("J :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
