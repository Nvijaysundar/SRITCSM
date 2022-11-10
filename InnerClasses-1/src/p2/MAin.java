package p2;
import p1.Oclass;
public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oclass ob = new Oclass();
		ob.m1();
		
		Oclass.Subclass ob2 = new Oclass.Subclass();
		Oclass.Subclass.m2();
		ob2.m3();
		
	}

}
