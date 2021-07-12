package chinna;
import java.util.*;
public class nearest_prime_no {
	static int prime(int n)
	{
		int f =1;
		for(int i = 2 ; i <= n/2 ; i++)
		{
			if(n%i==0)
			{
				f = 0;
				break;
			}
		}
		if(f == 1)
			return 1;
		else
			return 0;
	}
	static int bprime(int n)
	{
		int c = 0;
		while(true)
		{
			if(prime(n)==1)
				return c;
			else
			{
				n = n-1;
				c = c+1;
			}
		}
	}
	static int aprime(int n)
	{
		int c=0;
		while(true)
		{
			if( prime(n)==1)
				return c;
			else
			{
				n=n+1;
				c=c+1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = scan.nextInt();
		int m1 = bprime(n);
		int m2 = aprime(n);
		if(m1 > m2)
			System.out.println("Nearest prime = "+(n+m2));
		else if(m2 > m1)
			System.out.println("Nearest prime = "+(n-m1));
		else if( (n+m2) == (n-m1) )
			System.out.println("Prime Number = "+n);
		else if(m1 == m2)
			System.out.println("Nearest Prime are "+(n-m1)+" "+(n+m2));
		}
}
