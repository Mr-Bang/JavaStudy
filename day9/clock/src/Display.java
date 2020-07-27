public class Display
{
    int value;
    int limit;
    Display(int limit)
    {
        this.limit = limit;
    }
    void increase()
    {
        value++;
        if(value == limit)
        {
            value = 0;
        }
    }
    int getValue()
    {
        return value;
    }
//    public static void main(String[] args)
//    {
//        Display hour = new Display(24);
//        Display min = new Display(60);
//        for(;;)
//        {
//            if(min.value == 59)
//            {
//                hour.increase();
//            }
//            min.increase();
//            System.out.println("hour: "+hour.value+"min: "+min.value);
//
//        }
//    }
}
