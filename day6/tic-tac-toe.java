import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean getresult = false;
        Scanner in = new Scanner(System.in);
//        按行读取棋盘
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int numberof0 = 0;
        int numberof1 = 0;
//        判断行
        MainLoop:
        while(true)
        {            for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (board[i][j] == 0)
                {
                    numberof0++;
                }
                else
                {
                    numberof1++;
                }

            }
            if (numberof0 == 3 || numberof1 == 3)
            {
                getresult = true;
                break MainLoop;
            }
            else
            {
                numberof0 = 0;
                numberof1 = 0;
            }
        }

            //        判断列
            for(int i = 0;i<SIZE;i++)
            {
                for(int j = 0 ;j<SIZE;j++)
                {
                    if(board[j][i]==0)
                    {
                        numberof0++;
                    }
                    else
                    {
                        numberof1++;
                    }
                }
                if (numberof0 == 3 || numberof1 == 3)
                {
                    getresult = true;
                    break MainLoop;
                }
                else
                {
                    numberof0 = 0;
                    numberof1 = 0;
                }
            }

            //        判断对角线
            for(int i =0;i<SIZE;i++)
            {
                if(board[i][i]==0)
                {
                    numberof0++;
                }
                else
                {
                    numberof1++;
                }
            }
            if (numberof0 == 3 || numberof1 == 3)
            {
                getresult = true;
                break MainLoop;
            }
            else
            {
                numberof0 = 0;
                numberof1 = 0;
            }
            for(int i = 0;i<SIZE;i++)
            {
                if(board[i][SIZE-i-1]==0)
                {
                    numberof0++;
                }
                else
                {
                    numberof1++;
                }
            }
            if (numberof0 == 3 || numberof1 == 3)
            {
                getresult = true;
                break MainLoop;
            }
            else
            {
                break;
            }
        }
        if(getresult&&numberof0==3)
        {
            System.out.println("get result! circle wins!");
        }
        if(getresult&&numberof1 == 3)
        {
            System.out.println("get result! cross wins!");
        }
        if(!getresult)
        {
            System.out.println("no result");
        }

    }

}
