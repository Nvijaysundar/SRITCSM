package p1;

public class Address {
	String Hno,Stname,city;
	int pin;
	public Address(String Hno,String Stname,String city,int pin)
	{
		this.Hno = Hno;
		this.Stname = Stname;
		this.city = city;
		this.pin = pin;
	}
	
	public String toString()
	{
		return Hno+"\t"+Stname+"\t"+city+"\t"+pin;
	}
}
