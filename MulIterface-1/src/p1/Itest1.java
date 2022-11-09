package p1;

public interface Itest1 {
	abstract void m1();
	abstract void m3();
	
	default void m4()
	{
		System.out.println("This is DEfault method");
	}
}
