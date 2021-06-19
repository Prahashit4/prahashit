package chinna;
import java.util.*;
public class sum_of_digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n = scan.nextInt();
		int sum = 0,rem;
		while( n!=0)
		{
			rem = n%10;
			sum = sum + rem;
			n=n/10;
		}
		System.out.println("sum of the digits = "+sum);
	}

}
