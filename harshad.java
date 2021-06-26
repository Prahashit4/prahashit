package chinna;
import java.util.*;
public class harshad {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int  sum = 0;
		int temp = n;
		while( n > 0 )
		{
			int rem = n%10;
			sum = sum + rem ;
			n = n/10;
		}
		if(temp%sum == 0)
			System.out.println("It is a Harshad.");
		else
			System.out.println("It is not a Harshad.");

	}

}
