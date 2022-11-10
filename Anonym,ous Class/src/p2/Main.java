package p2;
import p1.Pclass;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pclass ob = new Pclass() {
			public void m1()
			{
				System.out.println("Thi s OR of pClass");
			}
			public void m3()
			{
				System.out.println("This m3 method");
			}
		};
		ob.m1();
		Pclass.m2();

	}

}
