
import Electronic.*;
import Footwear.*;
import Cloths.*;
import java.util.*;
class Snapdeal
{
	public static void main(String []arg)
	{
		
		System.out.println("1-Clothing"+"\n"+"2-Electronics"+"\t"+"3-Footwear");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{	Clothing c=new Clothing();
			c.wear();
		}
		else if(n==2)
		{
			Electronics e=new Electronics();
			e.gadget();
		}
		else if(n==3)
		{
			Shoes s=new Shoes();
			s.Foot();
		}
	}
}
			