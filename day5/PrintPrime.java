import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        for(int num =1;num<100;num++)
        {
            int res = num - 1;
//            if(num ==1)
//            {
//                System.out.println("该数字不是素数");
//            }
//            else {
                while (res != 0) {
                    if (num % res == 0) {
                        if (res == 1) {
                            System.out.println(num);
                        }
                        else {
//                            System.out.println("该数字不是素数");
                            break;
                        }
                    }
                    res--;
                }
//            }
        }

    }

}
