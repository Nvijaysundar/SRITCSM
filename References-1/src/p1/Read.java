package p1;

import java.util.Scanner;

public class Read {
	public void getData(Student st,Scanner sc)
	{
		System.out.println("Enter Name");
		st.Name = sc.nextLine();
		System.out.println("Enter Roll");
		st.Roll = sc.nextLine();
		System.out.println("Enter Email");
		st.c.Emaiid = sc.nextLine();
		System.out.println("ENte phno:");
		st.c.phno = Long.parseLong(sc.nextLine());
		System.out.println("ENte Hno:");
		st.ad.Hno = sc.nextLine();
		System.out.println("ENte Stname:");
		st.ad.Stname = sc.nextLine();
		System.out.println("ENte City:");
		st.ad.city = sc.nextLine();
		System.out.println("ENte pin:");
		st.ad.pin = Integer.parseInt(sc.nextLine());
		int sb,totm=0,flag=1;
		for(int i=1;i<=6;i++)
		{
			System.out.println("ENter sub "+i+"MArks:");
			sb = sc.nextInt();
			totm += sb;
			if(sb<40)
			{
				flag =0;
			}
		}
		st.m.per = totm/6.0f;
		if(flag ==1)
		{
			st.m.res = "PASS";
		}
		else
			st.m.res = "Fail";
	}
}
