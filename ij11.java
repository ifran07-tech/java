import java.util.*;
class ij11 

{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enetr The No. Of Tank To Fill The Tank:");
        float b=a.nextFloat();
        System.out.println("Enter The Distance Covered :");
        float c=a.nextFloat();
        double eu=((b*100)/c);
        double us=((c*0.6214)/(b*0.2642));
        System.out.println("(Litre/100km)" +eu);
        System.out.println("(Miles/Galoon)" +us);
    }
}