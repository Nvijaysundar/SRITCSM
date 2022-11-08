package p1;

public class Subclass extends Pclass {
	public Subclass(int a,int b,int c)
	{
		super(a, b);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("C : "+c);
	}
	public Subclass(int a,int b,int c,int d)
	{
		this(a, b, c);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("C : "+c);
		System.out.println("D: "+d);
	}
}
