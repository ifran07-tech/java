import java.util.*;
public class matrixmulti {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int [][] c=new int[3][3];
        int [][] d=new int[3][3];
        int [][] e=new int[3][3];
        System.out.println("Enter a 1st matrix:");
        for(int i=0;i<c.length;i++)
        {
            for (int j=0;j<c.length;j++)
            {
                c[i][j]=a.nextInt();
            }
        }
            
        System.out.println("Enter A 2nd Matrix: ");
        for (int i=0;i<d.length;i++)
        {
            for(int j=0;j<d.length;j++)
            {
                d[i][j]=a.nextInt();
            }
        }
        
        for (int i=0;i<d.length;i++)
        {
            for( int j=0;j<d.length;j++)
            {
                e[i][j]=c[i][j]*d[i][j];

            }
        }
        System.out.println("Multiplication OF MATRIX:");
        for (int i=0;i<e.length;i++)
        {
            for(int j=0;j<e.length;j++)
            {
                System.out.print(" " +e[i][j]);
            }   
            System.out.println("") ;
        }

        
        
    }    
}