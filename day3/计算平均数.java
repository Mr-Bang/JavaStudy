import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("请输入数字，以-1结束");
        Scanner in = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int a;
        do
        {
            a = in.nextInt();
            if(a!=-1) {
                i = i + 1;
                sum = sum + a;
            }
        }while(a!=-1);
        double average =(double)sum/i;
        System.out.println("sum is :"+sum);
        System.out.println("average is :"+average);
        System.out.println("number is :"+i);
    }
}
