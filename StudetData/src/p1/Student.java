package p1;

public class Student {
	String Name,Roll;
	
	public Student(String Name,String Roll)
	{
		this.Name = Name;
		this.Roll = Roll;
	}
	
	public String toString()
	{
		return Name+"\t"+Roll;
	}
}
