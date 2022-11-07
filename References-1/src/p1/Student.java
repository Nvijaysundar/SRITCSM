package p1;

public class Student {
	String Name,Roll;
	Address ad;
	Marks m;
	Contact c;
	Department d = new Department();
	public Student(Address ad, Marks m,Contact c)
	{
		this.ad = ad;
		this.m = m;
		this.c = c;
	}
	
	public void GetDetails()
	{
		System.out.println("NAme: "+Name);
		System.out.println("RollNo: "+Roll);
		System.out.println("Emailid: "+c.Emaiid);
		System.out.println("Phno: "+c.phno);
		System.out.println("Department: "+d.getDepart(Roll));
		System.out.println("Hno: "+ad.Hno);
		System.out.println("Stname: "+ad.Stname);
		System.out.println("City: "+ad.city);
		System.out.println("Pin: "+ad.pin);
		if(m.res.equals("Fail")) {
		System.err.println("per: "+m.per);
		System.err.println("Result: "+m.res);
		}
		else {
			System.out.println("per: "+m.per);
		System.out.println("Result: "+m.res);
		}
	}
}
