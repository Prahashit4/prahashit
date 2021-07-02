package chinna;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			int n =scan.nextInt();
			int flag = 1;
			if(n==0 || n==1)
			{
				System.out.println(n+" is not a prime number");
			}
			else
			{
				 for(int i = 2 ; i <= n/2 ; i++)
				 {
					 if (n % i == 0)
					 {
						 System.out.println(n+" is not a prime number");
						 flag = 0;
						 break;
					 }
					 
				 }
				 if(flag == 1)
				 {
					 System.out.println(n+" is a prime number");
				 }
			}
		}

	}

}
