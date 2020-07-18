import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean[] isPrime = new boolean[50];
        for(int i = 1;i<isPrime.length;i++)
        {
            isPrime[i]=true;
        }
        int cnt = 1;
        for(int x = 2;x<50;x++)
        {
            if(isPrime[x])
            {
                for(int j = 2;j*x<50;j++)
                {
                    isPrime[j*x]=false;
                }
            }
        }
        for(int i = 1;i<isPrime.length;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+" ");
            }
        }
    }

}
