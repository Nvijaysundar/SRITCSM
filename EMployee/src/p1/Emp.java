package p1;

public class Emp {
	String name,id;
	Address ad = null;
	Contact c = null;
	Branch b = null;
	Salary s = null;
	public Emp(Contact c,Address ad,Branch b,Salary s)
	{
		this.c = c;
		this.ad = ad;
		this.b =b;
		this.s=s;
	}
	public void DisplayData()
	{
		System.out.println("NAme: "+name);
		System.out.println("Emp iD: "+id);
		System.out.println("Emailid: "+c.Emaiid);
		System.out.println("Phno: "+c.phno);
		System.out.println("Department: "+b.Dept);
		System.out.println("Branch City: "+ b.BCity);
		System.out.println("Hno: "+ad.Hno);
		System.out.println("Stname: "+ad.Stname);
		System.out.println("City: "+ad.city);
		System.out.println("Pin: "+ad.pin);
		System.out.println("Total Sal: "+ (s.Bsal + ((0.23f)*s.Bsal) +(.54f*s.Bsal) ));
	}
}
