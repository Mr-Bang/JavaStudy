import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int []prime = new int[50];
        int cnt = 1;
        prime[0]=2;
        MainLoop:
        for(int x = 3;cnt<50;x++)
        {
            for(int i = 0;i<cnt;i++)
            {
                if(x%prime[i]==0)
                {
                    continue MainLoop;
                }
            }
            prime[cnt++]=x;
        }
        for(int data:prime)
        {
            System.out.print(data+" ");
        }
    }

}
