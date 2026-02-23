import java.util.*;
class ij15
{
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("Enter");
    float n=a.nextFloat();
    int count=0;
    while(n!=0) 
    {
        n=n/10;
        count++;
    }
    System.out.println("Count:" +count);
}
}