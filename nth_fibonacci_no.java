package chinna;
import java.util.*;
public class nth_fibonacci_no {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number:");
		int n = scan.nextInt();
		int t1 = 0 , t2 = 1 , sum = 0;
		for(int i = 3 ; i <= n ; i++)
		{
			sum = t1 + t2;
			t1 = t2;
			t2 = sum ;
		}
		System.out.print(sum);
	}
}
