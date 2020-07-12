import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        System.out.println("请输入您猜的数字（输入0到100之间的数字");
        int random = (int)(Math.random()*(100+1));
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int count = 1;
        while(input!=random)
        {

            if(input>random)
            {
                System.out.println("大了");
            }
            else if(input<random)
            {
                System.out.println("小了");
            }
            input = in.nextInt();
            count = count +1;
        }
        System.out.println("恭喜您，猜对了！");
        System.out.println("正确答案是："+random);
        System.out.println("您猜了"+count+"次");
    }

}
