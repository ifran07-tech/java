import java.util.Scanner;

public class ij9 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The No. Of Studentd Placed in CSE:");
        float b=a.nextFloat();
        System.out.println("Enter The No. OF Studentd Placed in ECE:");
        float c=a.nextFloat();
        System.out.println("Enter The Number Of Students Placed In MECH:");
        float d=a.nextFloat();
        if(b>c && b>d)
        {
            System.out.println("Highest Placement");
            System.out.println("CSE");
        }
        else if(c>d && c>b)
            {
                System.out.println("Highest Placement");
                System.out.println("ECE");
            }
            else 
                {
                    System.out.println("Highest Placement");
                    System.out.println("MECH");
                } 


    }
}
