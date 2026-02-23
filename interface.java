interface circle 
{
    double pai=3.14;
    
    public void calc();
}
class Area implements circle
{
double r,area;
Area(double r)
{
    this.r=r;
}
public void calc()
{
    area=3.14*r*r;
    System.out.println("Area of circle is "+area);
}
public static void main(String[] args) {
    {
        Area obj=new Area(10);
        obj.calc();
    }
}
} 