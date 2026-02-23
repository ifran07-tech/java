class factorial
{
    int n,fact;
    factorial(int n)
    {
        fact=1;
        this.n=n;
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
    public class constructor1 {
        public static void main(String[] args) {
            int n=6;
            factorial obj=new factorial(n);
            obj.calc();//
        }
    
}
