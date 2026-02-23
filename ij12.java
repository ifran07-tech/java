import java.util.Scanner;

public class ij12 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Month:");
        int m=a.nextInt();
        if (m<=3 && m>=5)
        {
            System.out.println("SPRING");
        }
        else if(m>=6 && m<=8)
        {
            System.out.println("SUMMER");
        }
        else if(m>=9 && m<=11)
        {
            System.out.println("autumn");
        }
        else if(m>12 || m==0)
        {
            System.out.println("INVALID MONTH");
        }
        else{
            System.out.println("Winter");
        }

    }
}
