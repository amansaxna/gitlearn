package Cloths;		
import java.util.Scanner;
public class Women extends Features
{
	public void woman()
	{
		System.out.println("1-top"+"\n"+"2-bottom");
		 int n;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 if(n==1)
			 System.out.println("1-Shirt"+"\n"+"2-Tops");
		 else if(n==2)
			 System.out.println("1-Jeans"+"\n"+"2-Jaggings");
		  
	}
}