package com.pattern;

public class startpattern {

	public static void main(String[] args) {
		
		int i, j;
		
		for (i=1;i<=5;i++)//rows
		{
			
			for (j=1;j<i;j++) //Column
			{ 
				System.out.print("*");
			}
					System.out.print("\n");
			 
		 }
	}

}
