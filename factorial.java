package chinna;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = scan.nextInt();
		int f = 1;
		for(int i = 1 ; i <=n ; i++)
		{
			f=f*i;
			
		}
		System.out.println("Factorial of "+n+ " = "+f);
		
		
	}

}
