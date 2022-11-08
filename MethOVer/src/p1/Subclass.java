package p1;

public class Subclass extends Pclass {
	public void m1(int a,int b,int c)
	{
		super.m1(a, b);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("C : "+c);
	}
	public void m1(int a,int b,int c,int d)
	{
		this.m1(a, b, c);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("C : "+c);
		System.out.println("D: "+d);
	}
}
