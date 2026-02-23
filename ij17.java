import java.util.*;
class ij17
{
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter");
    float n=a.nextFloat();
    int sum=0;
    int rem;
    while(n!=0) 
    {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    System.out.println("Sum:" +sum);
}
}