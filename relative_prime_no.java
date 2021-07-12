package chinna;
import java.util.*;
public class relative_prime_no {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int gcd=1;
		for(int i = 1; i<=n1 && i<=n2 ; i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd = 1;
		}
		if(gcd==1)
			System.out.println("Relative prime number");
		else
			System.out.println("Not Relative prime number");
}}
