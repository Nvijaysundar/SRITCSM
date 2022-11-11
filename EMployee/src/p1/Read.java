package p1;
import java.util.Scanner;
public class Read {
	public void Getdata(Emp e,Scanner sc)
	{
		System.out.println("Enter name");
		e.name = sc.nextLine();
		System.out.println("Enter Id");
		e.id = sc.nextLine();
		System.out.println("Enter Phno:");
		e.c.phno = Long.parseLong(sc.nextLine());
		System.out.println("Enter Emailid");
		e.c.Emaiid = sc.nextLine();
		System.out.println("ENter Dept");
		e.b.Dept = sc.nextLine();
		System.out.println("Enter BrCity");
		e.b.BCity = sc.nextLine();
		System.out.println("Enter Hono");
		e.ad.Hno = sc.nextLine();
		System.out.println("Enter Stname");
		e.ad.Stname = sc.nextLine();
		System.out.println("enter City");
		e.ad.city = sc.nextLine();
		System.out.println("ENter Pincode");
		e.ad.pin = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Bsal: ");
		e.s.Bsal = Float.parseFloat(sc.nextLine());
	}
}
