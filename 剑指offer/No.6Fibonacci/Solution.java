package No1findRepeatNumber;
class Solution {
//    方法一。记忆数组
//    int[] mem = new int[100];
//    public int fib(int n) {
//
//        if(n==0)
//            return 0;
//        else if(n==1)
//            return 1;
//        else if(mem[n]!=0)
//        {
//            return mem[n];
//        }
//        else {
//            mem[n] = (fib(n - 1) + fib(n - 2))%1000000007;
//            return mem[n];
//        }
//    方法二，从下往上算
public int fib(int n)
{
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    int[] buff = new int[n+1];
    buff[0] = 0;
    buff[1] = 1;
    for (int i = 2; i <buff.length ; i++)
    {
        int temp1= buff[i-1];
        int temp2 = buff[i-2];
        buff[i] = temp1+temp2;
        while(buff[n]>=1000000007)
        {
            buff[n]%=1000000007;
        }
    }
    return buff[n];
}

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.fib(45));
    }
}