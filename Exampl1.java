import java.util.*;
class Example1

    static String college="HICET";
    String name;
    Example1 (String name)
    {
        this.name=name;
    }
    public void disp()
    {
        System.out.print(name +"stud is @"+college);
    }
   
    public static void main(String[] args) {
        Example1 obj=new Example1();
        obj.disp();

    }
}
