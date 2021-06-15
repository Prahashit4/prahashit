package Pack1;
import java.util.*;
public class greater{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(a>b) ? a : b;
		System.out.println("bigger number = "+ c);
		
	}
 
}
