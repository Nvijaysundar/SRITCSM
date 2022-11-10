package p1;

public class Oclass {
	int a=10;
	static int b =20;
	public static void m1()
	{
		class Subclass1
		{
			void m2()
			{
				System.out.println("b: "+b);
			}
			static void m3()
			{
				System.out.println("b: "+b);
			}
		}
		Subclass1 ob = new Subclass1();
		ob.m2();
		Subclass1.m3();
	}
	public void m2()
	{
		class Subclass1
		{
			void m2()
			{
				System.out.println("b: "+b);
				System.out.println("A: "+a);
			}
			static void m3()
			{
				System.out.println("b: "+b);
			}
		}
		Subclass1 ob = new Subclass1();
		ob.m2();
		Subclass1.m3();
	}
}
