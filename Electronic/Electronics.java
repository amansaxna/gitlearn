package Electronic;
import java.util.Scanner;
public class Electronics
{
	public void gadget()
	{
		System.out.println("1-mobile"+"\t"+"2-Laptop");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			Mobile m=new Mobile();
			m.mobi();
			m.input();
			m.disp();
		
		}
		else if(n==2)
		{
			Laptop w=new Laptop();
			w.lapi();
			w.input();
			w.disp();
			
		}
		
	}
}
		
		
		