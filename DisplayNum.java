package project1;

import java.util.Scanner;

public class DisplayNum 
{
	
	public static void main(String args[])
	{
		int r,c,r1,c1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=in.nextInt();
		System.out.println(" " + " " +" 1");
		
		for(r=2;r<=n1;r++)
		{
			
			for(c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.print(" ");
			
			for(r1=r;r1>=1;r1--)
				
			{
				System.out.print(r1+" ");
			}
			System.out.println(" ");
			
					
		}
		
		for(r=n1;r>=2;r--)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.print(" ");
			
			for(c1=r;c1>=1;c1--)
			{
				System.out.print(c1 +" ");
			}
			System.out.println(" ");
				
		}
		System.out.println(" "+" "+"  1");
		
		
		
	}

}
