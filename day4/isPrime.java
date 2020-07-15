import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("请输入数字");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int res = num - 1;
            if(num ==1)
            {
                System.out.println("该数字不是素数");
            }
            else {
                while (res != 0) {
                    if (num % res == 0) {
                        if (res == 1) {
                            System.out.println("该数字是素数");
                        } else {
                            System.out.println("该数字不是素数");
                            break;
                        }
                    }
                    res--;
                }
            }
        }

    }

}
