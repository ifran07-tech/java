import java.util.*;
public class ijfact {
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    System.out.println("Enter A Number:");
    int n=k.nextInt();
    int fact=1;
    for(int i=0;i<n;i++)
    {
            fact+=fact*i;
        }
        System.out.println("Factorial:"+fact);
    }
}
