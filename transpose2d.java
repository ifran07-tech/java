import java.util.*;
class transpose2d
{
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
        System.out.println("TRANSPOSE:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                
                System.out.print(" " +a[j][i]);
            }
            System.out.println(" ");
            
        }
    }
    
}

