import java.util.*;
public class ai13 {
        int []a={20,30,43,65,23};
        int max=a[0];
        int sm=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                sm=max;
                max=a[i];
            }
            else if(a[i]>sm && a[i]!=max)
            {
                sm=a[i];

            }
        }
        System.out.println("max:" +max);
        system.out.println("Second max" +sm);

    }
    
}
