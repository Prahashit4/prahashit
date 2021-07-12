package chinna;
import java.util.*;
public class twin_prime {
	static int prime(int n)
	{
		int f = 1;
		for(int i=2; i<=n/2 ; i++)
		{
			if(n%i==0)
				f =0;
			break;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		if(prime(n2)==1 && prime(n1)==1 && (n2 -n1 == 2))
			System.out.println("twin prime number");
		else
			System.out.println("Not twin prime number");
}
}
