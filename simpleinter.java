package Pack1;

import java.util.Scanner;

public class simpleinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println("principle =  "+p);
		System.out.println("rate =  "+r);
		System.out.println("no of months =  "+n);
		int si=(p*n*r)/100;
		System.out.println("Simple Interest = "+si);
				
		

	}

}
