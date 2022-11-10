package p1;

public abstract class Aclass {
	public Aclass()
	{
		System.out.println("Its from Constructor");
	}
	public abstract void m1();
	public void m2(int x)
	{
		System.out.println("X: "+x);
	}
	static
	{
		System.out.println("THis is Static Block");
	}
	
	{
		System.out.println("This is N Satic Block");
	}
}
