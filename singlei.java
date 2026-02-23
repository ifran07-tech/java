import java.util.*;
public class singlei {
    int a,b;
    public void getdata()
    {
        Scanner in=new Scanner (System.in);
        a=in.nextInt();
        b=in.nextInt();
    }

    }
    class Sum extends singlei
    {
        int c;
        public void Sum()
        {
            c=a+b;
            System.out.println("Sum=" +c);
        }
        public static void main(String []args)
        {
            Sum obj=new Sum();
            obj.getdata();
            obj.Sum();
        }
    }
    

