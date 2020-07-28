package clock;

public class Display
{
    int value;
    int limit;
    private static int step = 0;
    public Display(int limit)
    {
        this.limit = limit;
    }
    public void increase()
    {
        value++;
        if(value == limit)
        {
            value = 0;
        }
    }
    void f(Display a)
    {
        a.value++;
    }
    public int getValue()
    {
        return value;
    }
    public static void main(String[] args)
    {
        Display d1 = new Display(10);
        d1.step = 2;
        Display d2 = new Display(10);
        System.out.println(d2.step);
        Display hour = new Display(24);
        Display min = new Display(60);
        for(;;)
        {
            if(min.value == 59)
            {
                hour.increase();
            }
            min.increase();
            System.out.println("hour: "+hour.value+"min: "+min.value);

        }
    }
}
