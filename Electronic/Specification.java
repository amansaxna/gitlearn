package Electronic;
import java.util.Scanner;
public class Specification
{

		int size[]=new int[5];int price[]=new int[5];int qty[]=new int[5];int n,i;static int a;int ram[]=new int[5];
		String brand[]=new String[5];
		String os[]=new String[5];
		public void input()
		{
			for(i=0;n<2;i++)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr size");
			size[i]=sc.nextInt();
			System.out.println("Ram");
			ram[i]=sc.nextInt();
			System.out.println("Os");
			os[i]=sc.next();
			System.out.println("eneter brand");
			brand[i]=sc.next();
			System.out.println("eneter price");
			price[i]=sc.nextInt();
			System.out.println("eneter quantiy");
			qty[i]=sc.nextInt();
			System.out.println("press"+"\n"+ "1-buy more"+"\n"+"2-checkout");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			if(n==2)
			{
				
				break;
			}
			else if(n==1)
			{
				a=a+1;
				continue;
			}
			
			}
			
		}
		public void disp()
		{
			System.out.print("product"+"\t\t\t\t\t"+"qty"+"\t"+"rate"+"\t"+"amount"+"\n");
				for(i=0;i<=a;i++)
				{
					System.out.print(brand[i]+"\t"+ram[i]+"\t"+os[i]+"\t"+qty[i]+"\t"+price[i]+"\t"+(price[i]*qty[i])+"\n");
				}
				
		}
		
		
	
}