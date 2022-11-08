package p1;

public class Main {

	static
	{
		System.out.println("This is Static block");
	}
	
	{
		System.out.println("This is instance Block");
	}
	public static void main(String[] args) {
		
		Main ob = new Main();

	}

}
