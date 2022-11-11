package Maccess;

public class Main {

	public static void main(String[] args) {
		
		Runnable ob1 = ()->
		{
			for(int i=100;i<=110;i++)
			{
				System.out.println("i: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable ob2 = ()->
		{
			for(int i=200;i<=210;i++)
			{
				System.err.println("J: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		new Thread(ob1).start();
		new Thread(ob2).start();
	}

}
