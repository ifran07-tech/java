
import java.util.Scanner;

public class ij14 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter A Number:");
        float b=a.nextFloat();
        int sum=0;
        for (int i=0;i<=b;i++)
        {
            sum=sum+i;
        }
        System.out.println("SUM:" +sum);

    }
    
}
