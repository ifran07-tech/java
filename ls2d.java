import java.util.*;
public class ls2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Number:");
        int [][] a=new int[3][3];
        
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int small=a[0][0];
        for (int i=0;i<a.length;i++)
        {
                for(int j=0;j<a.length;j++)
                    {
                        if(small>a[i][j]){
                            small=a[i][j];
                            System.out.println("Smallest Number" +small);
                        }
                    }
                    
           
        }
        
        

    }
    
}