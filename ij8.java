import java.util.*;
public class ij8 {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the no. of pizzas Bought: ");
        float c=b.nextFloat();
        System.out.println("Enter The no.of puffs bought:");
        float d=b.nextFloat();
        System.out.println("Enter The No. of Campa Bought:");
        float e=b.nextFloat();
        float f;
        f=((c*100) + (d*20) + (e*10));
        System.out.println("Bill Details");
        System.out.println("No. Of Pizzas:" +c);
        System.out.println("NO. Of Puffs:" +d);
        System.out.println("No. Of Campa:" +e);
        System.out.println("Total Price:" + f);
    }
    }

