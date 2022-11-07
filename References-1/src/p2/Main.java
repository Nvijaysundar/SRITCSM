package p2;
import java.util.Scanner;

import p1.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address ad = new Address();
		Contact c = new Contact();
		Marks m = new Marks();
		Student st = new Student(ad, m, c);
		Read  r= new Read();
		r.getData(st,sc);
		Display d = new Display();
		d.Getout(st);
	}

}
