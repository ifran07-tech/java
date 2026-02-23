import java.util.*;
public class ijnp {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter A Number:");
    float n=in.nextFloat();
    boolean isprime=true;
    if(n<=1)
    {
        isprime=false;
    }
    else 
    {
        for(int i=2;i<=n/2;i++)
        {if(n%i==0)
        {
            isprime=false;
            break;
        }
        }
    }
    if(isprime)
    {
        System.out.println("It is prime");
    }
    else{
        System.out.println("not a prime");
    }
}    
}
