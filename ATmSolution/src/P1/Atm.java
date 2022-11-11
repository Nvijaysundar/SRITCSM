package P1;
import java.util.*;
public class Atm {
	static int bal =10000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin_chances =3;
		while(true) {
			System.out.println("Enter PIn Number");
			int pin = sc.nextInt();
			if(pin == 1111 || pin == 2222 || pin == 3333)
			{
				System.out.println("Pin Verified");
				while(true)
				{
					System.out.println("1.BALANCE\n2.WITHDRAW\n3.DEPOSIT\n4.EXIT");
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Available Balance: "+bal);
						break;
					case 2:
						System.out.println("Enter Amount in 100 MUltiples");
						withdraw(sc.nextInt());
						break;
					case 3:
						System.out.println("Enter Amount in 100 MUltiples");
						Deposit(sc.nextInt());
						break;
					case 4:
						System.out.println("ThankYOu!!!");
						sc.close();
						System.exit(0);
					default:
						System.out.println("Invalid selection");
					}
				}
			}
			else
			{
				System.out.println("Wrong Pin Try Again!!");
				System.out.println("LEftove chances: "+ --pin_chances);
			}
			if(pin_chances==0)
			{
				System.out.println("Invalid PIn");
				System.out.println("Reach nearst BRanch");
				sc.close();
				System.exit(0);
			}
		}
	}

	private static void Deposit(int amt) {
		if(amt%100 ==0)
		{
			bal += amt;
			System.out.println("Available Balance: "+bal);
		}
		else
			System.out.println("Invalid AMount Format");
	}

	private static void withdraw(int amt) {
		if(amt%100 ==0)
		{
			if(amt<=bal)
			{
				bal -= amt;
				System.out.println("Available Balance: "+bal);
			}
			else
				System.out.println("Insufficient Funds");
			
		}
		else
			System.out.println("Invalid AMount Format");
		
	}

}
