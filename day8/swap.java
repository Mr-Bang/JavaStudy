import java.util.Scanner;
//java函数只能传值
public class  Main
{
    public static void swap(int a,int b)
    {
        int t = a;
        a = b;
        b = t;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;
        swap(a,b);
        System.out.println("a ="+a+"b ="+b);

    }

}
