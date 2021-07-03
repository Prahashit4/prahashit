package chinna;
import java.util.*;
public class prime_test {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number : ");
			long n = scan.nextLong();
			if(n==2)
			{
				System.out.println(1);
			}
			int i , result = 0;
			for(i = 2 ; i <= (n/2) ; i++ )
			{
				if(n%i==0)
				{
					result++;
					break;
				}
			}
			if(result == 0)
				System.out.println(1);
			else
				System.out.println(i);
		}
			

	}

}
