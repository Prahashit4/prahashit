package chinna;
import java.util.*;
public class nearest_fiboacci_no {
	static boolean fibo(int n)
	{
		int t1 = 0 , t2 = 1 , sum = 0;
		while(sum < n)
		{
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		if(sum == n)
			return true;
		else
			return false;
	}
	static int beFibo( int n )
	{
		int c = 0;
		while(true)
		{
			if(fibo(n))
				return c;
			else
			{
				n = n-1;
				c++;
			}
		}
	}
	static int afFibo( int n )
	{
		int c = 0;
		while(true)
		{
			if(fibo(n))
				return c;
			else
			{
				n=n+1;
			    c++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scan.nextInt();
		int m1 = beFibo(n);
		int m2 = afFibo(n);
		if(m1 > m2)
			System.out.println("Nearest Fibo = "+(n+m2));
		else if(m2 > m1)
			System.out.println("Nearest Fibo = "+(n-m1));
		else if((n-m1)==(n+m2))
			System.out.println("Nearest Fibo = "+n);
		else if(m1==m2)
			System.out.println("Nearest Fibo = "+(n-m1)+" "+(n+m2));

	}

}
