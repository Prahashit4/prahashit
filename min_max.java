package chinna;

import java.util.*;

public class min_max {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        int rem=0,max=0,min=9;
        while(n != 0)
        {
        	rem=n%10;
        	if(rem > max)
        	{
        		max = rem;
        	}
        	if(rem < min)
        	{
        		min = rem;
        	}
        	n=n/10;
        }
        System.out.println("maximum digit = "+max);
        System.out.println("minimum digit = "+min);

	}

}
