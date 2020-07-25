import java.util.Scanner;

public class Main
{
    static int getSum(int a,int b)
    {
        int sum = 0;
        for(int i = a;i<=b;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("请输入要求和的两个数字");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = getSum(a,b);
        System.out.println(a+" add "+ b+" equals :"+sum);


    }

}
