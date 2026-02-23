import java.util.*;
class ij13
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter A Number:");
        int n=a.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Monday");
                break;
            }
            case 2:
            {
                System.out.println("Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("Friday");
                break;
            }
            case 5:
            {
                System.out.println("Sunday");
                break;
            }
            case 6:
            {
                System.out.println("Thursday");
                break;
            }
            case 7:
            {
                System.out.println("Saturday");
                break;
            }
            default:
            {
                System.out.println("Invalid");
                break;
            }


                      
        }

    }
}