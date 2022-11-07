package p1;

public class Department {

	public String getDepart(String Roll)
	{
		switch(Roll.substring(6,8))
		{
		case "01":
			return "CIVIL";
		case "02":
			return "EEE";
		case "03":
			return "MECH";
		case "04":return "ECE";
		case "33": return "CSM";
		default : return "Invalid";
		}
	}
}
