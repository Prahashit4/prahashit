package chinna;
import java.util.*;
public class perfect_nott {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i == 0)
				sum = sum + i;
		}
		if(sum == n)
			System.out.println("perfect number");
		else
			System.out.println("not a pertect number");
	}

}
