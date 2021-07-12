package chinna;
import java.util.*;
public class mega_prime {
	static int prime(int n)
	{
		int i = 0 , flag = 1;
		if( n == 0 || n == 1 )
			return 0;
		else
		{
			for(i=2; i<= n/2;i++)
			{
				if(n%i==0)
				{
					flag = 0;
					break;
				}
			}
		}
		if(flag == 0)
			return 0;
		else
			return 1;
	}
	static int megaPrime(int n)
	{
		int rem = 0,flag = 1;
		if( prime(n) == 0)
			return 0;
		else
		{
			while( n != 0 )
			{
				rem = n%10;
				flag = prime(rem);
				if(flag == 0)
					return 0;
				n = n/10;
			}
		}
		if(flag == 1)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		int n = megaPrime(num);
		
		if(n == 1)
			System.out.println(num+" is Mega Prime");
		else
			System.out.println(num+" is not mega Prime");
		

	}

}
