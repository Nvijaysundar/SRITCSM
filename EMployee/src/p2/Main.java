package p2;
import p1.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Emp e = new Emp(new Contact(),new Address(),new Branch(),new Salary());
		 new Read().Getdata(e, new Scanner(System.in));
		 new Display().Disp(e);
		 
	}

}
