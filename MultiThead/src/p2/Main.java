package p2;
import p1.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 ob = new Display1();
		Display2 ob1 = new Display2();
		//Display3 ob2 = new Display3();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob1);
		//Thread t3 = new Thread(ob2);
		
		t1.start();
		t2.start();
		//t3.start();
	}

}
