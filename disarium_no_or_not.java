package chinna;
import java.util.*;
public class disarium_no_or_not {
	static int count(int n)
	{
		int rem = 0;
		while( n != 0)
		{
			rem = rem +1;
			n = n/10;
		}
		return rem;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int len = count(n);
		int num = n;
		int sum = 0;
	while( n > 0 )
	{
		int rem = n%10;
	    sum = sum + (int)Math.pow(rem ,  len); 
	    n = n/10;
	    len--;
	}
	if(sum == num)
		System.out.println(num+ " is disarium number ");
	else
		System.out.println(num+ " is not disarium number ");
	}

}
