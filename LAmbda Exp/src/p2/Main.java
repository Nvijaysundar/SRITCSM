package p2;
import p1.Itest;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itest ob = ()->
		{
			System.out.println("Thi is m1 method");
		};
		
		ob.m1();
	}

}
