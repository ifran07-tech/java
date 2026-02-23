import java.util.Scanner;

public class ij2 {
    public static void main(String[] args) {
        int a;
        Scanner b=new Scanner(System.in);
        a=b.nextInt();
        if((a%5==0)&&(a%7==0))
        {
            System.out.println("Is Divisible by 7 or 5");
        }
        else{
            System.out.println("May not be divisible 7 or 5");
        }
    }
}
