package chinna;
import java.util.*;
public class pronic_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = scan.nextInt();
		int x = 0;
		for(int i = 0; i < n ; i++ )
		{
			if( i*(i+1) == n)
			{
				x = 1;
				break;
			}}
			if(x == 1)
			{
				System.out.println("it is a pronic number");
			}
			else
			{
				System.out.println("it is not a pronic number");
			}
		

	}

}
