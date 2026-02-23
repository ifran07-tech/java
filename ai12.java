public class ai12 {
    public static void main(String[] args) {
        int []n={2,3,4,3,5,6,1,2};
        int k=9;
        int ml=0;
        
        int l=0;
        for(int i=0;i<n.length;i++)
        {
            int sum=0;
            {
                for (int j=i;j<n.length;j++)
                {
                    sum+=n[j];
               
                    {
                        if(sum==k){
                            l=j-i+1;
                            if(l>ml)
                        
                        
                        
                        
                            ml=l;
                        
                    }
                    }
                }
            }
    
}
System.out.println("Maximum:" +ml);

}
}