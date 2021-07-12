package chinna;
import java.util.Scanner;
public class prime_bw_two_no {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		for(int n = n1 ; n <= n2 ; n++)
		{
			if( n == 0 || n == 1)
			{
				continue;
			}
			else 
			{
				int flag = 1;
				for(int i = 2 ; i <= n/2 ; i++)
				{
					if(n % i == 0)
					{
						flag = 0;
						break;
					}
				}
				if( flag == 1)
					System.out.println(n+" ");
			}	
		}
	}
}
