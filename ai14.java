import java.util.*;
public class ai14 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("size");
        int n = m.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("enter first array");
        for (int i = 0; i < n; i++) {
            a[i] = m.nextInt();
        }

        System.out.println("enter second array");
        for (int i = 0; i < n; i++) {
            b[i] = m.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<n ;j++)
            {
                if(a[i]==b[j])
                {
                    count++;
                }
            }
        }
        if(count==n)
        {
            System.out.println("rotation");
        }
        else 
        {
            System.out.println("no Rotation");
        }
    }
}

