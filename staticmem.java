import java.util.*;
class staticmem
{
    static String college="HICET";
    String name;
    staticmem (String name)
    {
        this.name=name;
    }
    public void disp()
    {
        System.out.print(name +"stud is @"+college);
    }
   
    public static void main(String[] args) {
        staticmem obj=new staticmem('IFRAN');
        obj.disp();

    }
}
