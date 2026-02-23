class factorial
{
    int n,fact;
    factorial()
    {
        fact=1;
        n=5;
    }
    public void calc()
    {
        for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial=" +fact);
        }
    }
    public class constructor2 {
        public static void main(String[] args) {
            
            factorial obj=new factorial();
            obj.calc();
        }
    
}
