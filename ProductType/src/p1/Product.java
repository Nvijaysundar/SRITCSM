package p1;
import java.util.StringJoiner;
public class Product {
	 String code,Name;
	float price;
	int qty;
	public void SetProduct(String pcode,String pname,float pprice,int pqty)
	{
		code = pcode;
		Name = pname;
		price = pprice;
		qty = pqty;
	}
	public void getProduct()
	{
		StringJoiner sj = new StringJoiner("\t");
		sj.add(code).add(Name);
		sj.add(String.valueOf(price));
		sj.add(String.valueOf(qty));
		System.out.println(sj);
	}
}
