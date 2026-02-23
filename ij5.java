import java.util.*;
class ij5
{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter A percentage:");
        float a=b.nextFloat();
        float c=b.nextFloat();
        if((a>=85) && (c>=90))
            {
                System.out.println("First With Distinction:");
            }
            else if((a>=70) && (c>=80))
                {
                    System.out.println("First Class");
                }
                else if ((a>=60) && (c>=75))
                    {
                        System.out.println("second class");
                    }
                    else if ((a>=50) && (c>=75))
                    {
                        System.out.println("pass");
                    }
                    else
                        {
                            System.out.println("");
                        }
    }
}