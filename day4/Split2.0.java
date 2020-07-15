import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);
        int digit[] = new int[5];
        int num = in.nextInt();
        int i =0;
        do {
            int each = num%10;

            digit[i]=each;
            num = num/10;
            i++;
        }while(num!=0);
        for (int j =i-1;j>=0;j--)
        {
           System.out.println(digit[j]);
        }
    }

}
