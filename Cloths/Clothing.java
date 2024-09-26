package Cloths;
import java.util.Scanner;
public class Clothing
{
	public void wear()
	{
		System.out.println("1-Men"+"\t"+"2-Women"+"3-Kids");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			Men m=new Men();
			m.man();
			m.input();
			m.disp();
		
		}
		else if(n==2)
		{
			Women w=new Women();
			w.woman();
			w.input();
			w.disp();
			
		}else if(n==3)
		{
			Kids k=new Kids();
			k.bache();
			k.input();
			k.disp();
			
		}
		
	}
}
		
		
		