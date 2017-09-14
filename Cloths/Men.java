package Cloths;
import java.util.Scanner;
public class Men extends Features
{
	public void man()
	{
		 System.out.println("1-Upper wear "+"\n"+"2-Lower Wear");
		 int n;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 if(n==1)
		 {
			 System.out.println("1-Shirt"+"\n"+"2-T-Shirt");
	     }
		 else
			  System.out.println("1-Jeans"+"\n"+"2-Trouser");
		  
	}
}
