package p1;

public class Oclass {
	int a=10;
	static int b=20;
	public void m1()
	{
		System.out.println("This is m1 of outer class");
	}
	public class Subclass
	{
		int c =30;
		static int d=40;
		
		public static void m2()
		{
			System.out.println(" d: "+d);
			System.out.println("b: "+b);
		}
		public void m3()
		{
			System.out.println(" d: "+d);
			System.out.println("b: "+b);
			System.out.println(a);
		}
		
	}
}
