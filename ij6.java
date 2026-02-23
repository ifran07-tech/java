import java.util.*;
class ij6
{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter  a speed:");
        float a=b.nextFloat();
        if(a>120)
            {
                System.out.println("licence ban");
            }
            else if(a>101 && a<120)
                {
                    System.out.println("5000rs fine");
                }
                else if ((a>81) && (a>100))
                    {
                        System.out.println("1000rs fine");
                    }
                    else if ((a>61) && (a>80))
                    {
                        System.out.println("500rs fine");
                    }
                    else
                        {
                            System.out.println("no fine");
                        }
    }
}