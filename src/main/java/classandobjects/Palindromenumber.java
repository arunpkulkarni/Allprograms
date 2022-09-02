package classandobjects;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
	int a, s=0, c, r, n;
	System.out.println("Enter the Number");
	Scanner ref = new Scanner(System.in);
	n = ref.nextInt();
	c= n;
	while(n>0) 
		{
		r= n%10;
		s= (s*10)+r;
		n= n/10;
		}
	
	if(c==s) 
	System.out.println("No is palindrome ");
	else
	System.out.println("Number is not palindrome ");

	}

	
}

