import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("请输入n");
        Scanner in =new Scanner(System.in);
        Double n = in.nextDouble();
        double sum = 0;
        int sign=1;
//        方法一
//        for(int i = 1;i<=n;i++)
//        {
//            sum +=Math.pow(-1,i+1)*1.0/i;
//        }
//        方法二
//        for(int i=1;i<=n;i++,sign=-sign)
//        {
//            sum+=sign*1.0/i;
//        }
//        方法三
        for(int i =1;i<=n;i++)
        {
            if (i%2==0)
            {
                sum-=1.0/i;
            }
            else
            {
                sum+=1.0/i;
            }
        }
        System.out.println("f(n)="+sum);

    }

}
