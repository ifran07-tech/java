import java.util.*;

public class swapmat {
public static void main(String[] args) {
    Scanner m= new Scanner(System.in);
    int n=m.nextInt();
    int[][] a = new int[n][n];
    
    
    
    System.out.println("enter matrix");
    for(int i=0;i<a.length;i++)
    {
       for(int j=0;j<a.length;j++)
       {
        a[i][j]=m.nextInt();
       }
    }
    for(int j=0;j<n;j++)
    {
        int temp=a[0][j];
        a[0][j] = a[n- 1][j];
        a[n - 1][j]=temp;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println("");
    }
   

        
    }
    
   


        
    }