class Solution {
    int[] buff = new int[101];

    public int numWays(int n) {
        buff[1]=1;
        buff[2]=2;
        if(n==0)
            return 1;
        else if(buff[n]!=0)
            return buff[n];
        else
        {
            buff[n] = (numWays(n-1)+numWays(n-2))%1000000007;
        }

        return buff[n];
    }
}