package chinna;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n =scan.nextInt();
		int rev = 0, rem ;
		while(n != 0)
		{
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println("reverse = "+rev);
		
	}

}
