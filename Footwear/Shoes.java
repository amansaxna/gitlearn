package Footwear;
import java.util.Scanner;
public class Shoes
{
	public void Foot()
	{
		System.out.println("1-Sports"+"\t"+"2-Casual");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			Sports s=new Sports();
			s.Shoe();
			s.input();
			s.disp();
		
		}
		else if(n==2)
		{
			Casual c=new Casual();
			c.shoe();
			c.input();
			c.disp();
			
		}
		
	}
}
		
		
		