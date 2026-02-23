    import java.util.Scanner;
    public class ai11 {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);

        int n;
        System.out.println("enter array ");
        n=b.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=b.nextInt();
            
        }
        
       for (int i = 0 ;i < a.length; i++)
       {
        int count=0;
        for(int j=0; j<a.length;j++)
        {
            
            if(a[i]==a[j])
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println(a[i]  +"is unique");
        }

       }
    }
    
}
