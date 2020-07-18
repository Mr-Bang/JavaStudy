import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int []data = {1,2,3,4,5,6,7,8};
        int x=in.nextInt();
        int loc = -1;
        for(int i =0;i<data.length;i++)
        {
            if(data[i]==x)
            {
                loc = i;
                break;
            }
        }
        if(loc!=-1)
        {
            System.out.println("location is " + loc);
        }
        else
        {
            System.out.println("not found");
        }
    }

}
