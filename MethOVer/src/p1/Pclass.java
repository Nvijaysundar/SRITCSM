package p1;

public class Pclass {
	public void m1(int a)
	{
		System.out.println("a: "+a);
	}
	public void m1(int a,int b)
	{
		this.m1(a);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
}
