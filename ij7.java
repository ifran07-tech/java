import java.util.*;
class ij7
{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter  a BILL:");
        float a=b.nextFloat();
        if(a<=100)
            {
                System.out.println("1 unit");
            }
            else if(a<101 && a>200)
                {
                    System.out.println("2 unit");
                }
                else if (a<201 && a>300)
                    {
                        System.out.println("3 unit");
                    }
                    else
                        {
                            System.out.println("above 5 unit");
                        }
    }
}

