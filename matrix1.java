import java.util.*;
public class matrix1 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("Enter A Number");
        
        for(int i=0;i<a.length;i++)
        {
        

            for(int j=0;j<a.length;j++)
            {
                a[i][j]=m.nextInt();
            }
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                System.out.print(" " +a[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
