import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("请输入数字，以-1结尾");
       int [] count = new int[10];
       int input = in.nextInt();
       while(input!=-1)
 {
//     方法一
        switch (input)
        {
            case 0:
                count[0]++;
                break;
            case 1:
                count[1]++;
                break;
            case 2:
                count[2]++;
                break;
            case 3:
                count[3]++;
                break;
            case 4:
                count[4]++;
                break;
            case 5:
                count[5]++;
                break;
            case 6:
                count[6]++;
                break;
            case 7:
                count[7]++;
                break;
            case 8:
                count[8]++;
                break;
            case 9:
                count[9]++;
                break;
            case -1:
                break;
            default:
                System.out.println("请输入0到9之间的数字");
        }
//        方法2
////        if(input>=0&&input<=9)
////        {
////            count[input]++;
////        }
        input = in.nextInt();
 }
        for(int i =0;i<count.length;i++)
        {
            System.out.println("数字"+i+"有"+count[i]+"个");
        }

    }

}
