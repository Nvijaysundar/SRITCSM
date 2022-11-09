package p1;

public interface Itest2 {
	abstract void m2();
	abstract void m3();
	
	default void m5()
	{
		System.out.println("This is DEfault method");
	}
}
