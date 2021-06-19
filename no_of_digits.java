package chinna;

import java.util.Scanner;

public class no_of_digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = scan.nextInt();
		int count = 0;
		while(n != 0)
		{
			n = n/10;
			count++;
		}
		System.out.println("no of digits = "+count);
	}

}
