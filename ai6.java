import java.util.*;
class ai6
{
    public static void main(String[] args) {
        int n;
        int[]a=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter:");
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Array Element:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}


