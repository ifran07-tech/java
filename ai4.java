import java.util.*;
public class ai4 {
    public static void main(String[] args) {
        int n;
        int []a=new int[5];
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Array Elements:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);

        }
    }
    
}
