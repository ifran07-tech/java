import java.uti.*;
public class ai16  {

    public static void main(String[] args) {
        int n;
        int []num=new int[n];
        n = num.length;
        int[] result = new int[n];

        
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        int lp = 1;
        int rP = 1;

        for (int i = 0; i < n; i++) {
            
            result[i] *= lp;
            lp *= num[i];

            
            result[n - 1 - i] *= rp;
            rp *= num[n - 1 - i];
        }

        return result;
    }
}

    
