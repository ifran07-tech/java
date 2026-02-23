import java.util.*;
public class dectohex {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter a Number");
        int dec=m.nextInt();
        String hex =" ";
        int rem;
        while(dec>0)
        {
            rem=dec % 8;
            if (rem<10)
                hex=rem+hex;
            else if (rem>=10)
            {
                hex=(char)((rem-10)+'A')+hex;
            }
            dec=dec/8;
        }
            System.out.println(hex);
        }
        }
    

 