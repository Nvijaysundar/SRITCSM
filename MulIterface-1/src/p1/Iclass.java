package p1;

public class Iclass implements Itest1, Itest2 {

	public void m2() {
		System.out.println("this is m2");

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is m1");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("this is m3");
	}

}
