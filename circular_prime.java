package chinna;
import java.util.*;
public class circular_prime {
static int prime(int n)
{
	int flag = 1;
	for(int i = 2 ; i <= n/2 ; i++)
	{
		if(i%n == 0)
		{
			flag = 0;
			break;
		}
	}
	if(flag == 0)
		return 0;
	else
		return 1;
}
static int _prime(int n)
{
	int c = 0,temp = n;
	while(temp != 0)
	{
		c++;
		temp = temp/10;
	}
	int num = n;
	while(prime(num) == 1)
	{
		int rem = num%10;
		int div = num/10;
		num = (int)((Math.pow(10, c-1))*rem)+div;
		if(num == n)
			return 1;
	}
	return 0;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		if(_prime(num)==1)
		    System.out.println(num+ " is a circular prime number");
		else
			System.out.println(num+ " is not a circular prime number");
	}
}
