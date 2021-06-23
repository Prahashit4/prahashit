package chinna;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = 1;
		for(int i = 1 ; i <= a && i <= b ; i++ )
		{
			if( a%i == 0 && b%i == 0)
			{
				gcd = 1;
		    }
			int lcm = (a*b)/gcd;
			System.out.println("LCM = "+lcm);
		}

}
}