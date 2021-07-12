package chinna;
import java.util.*;
public class semiprime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scan.nextInt();
		int x = n;
		int c = 0;
		for(int i = 2 ; c < 2 && i*i <= n ; i++)
		{
			while( n%i == 0)
			{
				n = n/i;
				++c;
			}
		}
		if( n > 1)
		{ ++c;	}
		if( c == 2 )
			System.out.println(x+" is semiprime ");
		else
			System.out.println(x+" is not semiprime");

	}

}
