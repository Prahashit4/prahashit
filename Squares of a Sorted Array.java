import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),i;
        int[] a = new int[n];
        int[] b = new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        b[i]=(a[i])*(a[i]);
        Arrays.sort(b);
        for(i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}

// -1 3 -3
// 1 9 9 
