import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("请输入金额");
        Scanner in =new Scanner(System.in);
        int amount = in.nextInt();
        OUT:
        for(int twenty = 0;twenty<=amount/20;twenty++)
            {
                for(int ten = 0;ten<=amount/10;ten++)
                {
                    for(int five = 0;five<=amount/5;five++)
                    {
                        for(int one = 0;one <=amount;one++)
                        {
                            if(one+five*5+ten*10+twenty*20==amount)
                            {
                                System.out.println("需要"+one+"张1元"+five+"张5元"+ten+"张十元"+twenty+"张二十元");
                                break OUT;
                            }
                        }

                    }}
}
    }

}
