import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("请输入两个数字");
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
//        方法一 我的方法
//        int res=1;
//        for(int i = 1;i<=a&&i<=b;i++)
//        {
//            if((a%i==0)&&(b%i==0))
//            {
//                res = i;
//            }
//        }
//        方法二 辗转相除法
        int r = 0;
        while(b!=0)
        {
            r = a%b;
            a = b;
            b = r;
        }

        System.out.println(a);
    }

}
