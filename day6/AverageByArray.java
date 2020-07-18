import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("输入数字的个数");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        double sum = 0.0;
        System.out.println("输入数字");
        if(index>0)
        {
            int[] numbers = new int[index];
            for(int i = 0;i<numbers.length;i++)
            {
                numbers[i] = in.nextInt();
                sum+=numbers[i];
            }
            double average = sum/index;

            System.out.println("Average is "+average);
            System.out.print("numbers larger than average are ");
            for(int i = 0;i<numbers.length;i++)
            {
                if(numbers[i]>average){
                System.out.print(numbers[i]+", ");}
            }
        }


    }

}
