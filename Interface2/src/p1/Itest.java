package p1;

public interface Itest {
	void m1();
	public static void m2()
	{
		System.out.println("This is Static Con_M");
	}
	default void m3()
	{
		System.out.println("THis is Default COn_M");
	}
}
