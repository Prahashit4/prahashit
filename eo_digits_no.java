package chinna;

import java.util.Scanner;

public class eo_digits_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n = scan.nextInt();
		int rem;
		int odd=0,even=0;
		int odd_sum=0,even_sum=0;
		while(n != 0)
		{
			rem=n%10;
			if(rem%2 == 0)
			{
				even++;
				even_sum=even_sum+rem;
			}
			else
			{
				odd++;
				odd_sum=odd_sum+rem;
			}
			n=n/10;
		}
		System.out.println("no of even digits = "+even);
		System.out.println("sum of even digits = "+even_sum);
		System.out.println("no of odd digits = "+odd);
		System.out.println("sum of odd digits = "+odd_sum);

	}

}
