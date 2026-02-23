import java.util.*;
class ij3{
    public static void main(String[] args) {
        int a ;
        Scanner b=new Scanner(System.in);
        a=b.nextInt();
        if(a%4==0)
        {
            System.out.println("It Is A Leap year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}