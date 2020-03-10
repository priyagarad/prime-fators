package felloshipProgram;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int number=sc.nextInt();
			int count;
			for(int i=2;number!=1;i++)
			{
				count=0;
				if(number%i==0)
				{
					System.out.println(i);
					number=number/i;
					count=1;
				}
				if(count==1)
				{
					i--;
				}
		   }
	  }
  }
