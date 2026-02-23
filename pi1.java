public class pi1 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<n;j++)
            {
                System.out.println(" ");
            }
            for (int k=1;k<(2*i)-i;k++)
            {
                System.out.println("*");
            }
            System.out.println(" ");

        }
    }
    
}
