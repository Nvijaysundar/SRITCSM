package p2;
import p1.Product;
import java.util.*;
public class ExeProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product ob = new Product();
		String code = sc.nextLine();
		String Name = sc.nextLine();
		float price = sc.nextFloat();
		int qty = sc.nextInt();
		ob.SetProduct(code, Name, price, qty);
		System.out.println("Code\tName\tprice\tqty");
		ob.getProduct();
		sc.close();
	}

}
