import java.util.*;
class ai9 {
    public static void main(String[] args)
    {
        int []a={1,2,3,1,2};
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count ++;
                    break;
                }
            }
        }
        System.out.println("Count:"+count);
    }
}