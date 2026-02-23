
import java.util.*;

class Circle
{
    double r,area;
    public  void getdata()
    {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r:");
        r=in.nextDouble();
    }
    public void calc()
    {
        
        area=3.14*r*r;
        System.out.print("Area=" +area);

    }
}
class simpleclass1
{
    public static void main(String[] args)
        
    
    {
        Circle obj=new Circle();
        obj.getdata();
        obj.calc();
    }
}