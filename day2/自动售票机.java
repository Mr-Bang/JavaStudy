import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int balance = 0;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("请投币");
            int amount = in.nextInt();
            balance = amount + balance;
            if (balance>=10)
            {
                System.out.println("***************");
                System.out.println("**Java高铁专线**");
                System.out.println("****票价10元****");
                System.out.println("***************");
                System.out.println("找零："+(balance - 10)+"元");
                balance = 0;
            }
        }
    }
}
