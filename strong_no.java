package chinna;
import java.util.*;
public class strong_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = scan.nextInt();
		int fact,rem,sum = 0,temp = n;
		while(n != 0)
		{
			fact = 1;
			rem = n%10;
			int i =1;
			while(i <= rem)
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact;
			n = n/10;
		}
		if(sum == temp)
			System.out.println(temp+" is Strong number");
		else
			System.out.println(temp+" is not Strong number");
		

	}

}
