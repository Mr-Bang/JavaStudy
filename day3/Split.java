import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        do {
            int each = num%10;
            System.out.println(each);
            num = num/10;
        }while(num!=0);
    }

}
