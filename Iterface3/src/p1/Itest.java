package p1;

public interface Itest {
	private static void m2()
	{
		System.out.println("This is S-P -m2");
	}
	private void m3()
	{
		System.out.println("This is NS-P -m2");
	}
	
	default void access()
	{
		Itest.m2();
		this.m3();
	}
}
