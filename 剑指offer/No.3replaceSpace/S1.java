
package No1findRepeatNumber;


public class S1 {
    public String replaceSpace(String s) {
//        方法一 开一个三倍大小的char数组
//        if(s == null)
//        {
//            return null;
//        }
//        int len = s.length();
//        char[] array = new char[3*len];
//        int index = 0;
//        for (int i = 0; i <s.length() ; i++)
//        {
//            char c = s.charAt(i);
//            if(c == ' ')
//            {
//                array[index++] = '%';
//                array[index++] = '2';
//                array[index++] = '0';
//            }
//            else
//            {
//                array[index++]=c;
//            }
//        }
//        String ans = new String(array,0,index);
//        return ans;
//        方法二 使用StringBuffer
//        char[] array = s.toCharArray();
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < s.length(); i++)
//        {
//            if(array[i]==' ')
//                res.append("%20");
//            else
//                res.append(array[i]);
//        }
//        return res.toString();
//        方法三
//        return s.replace(" ","%20");
//        方法四 两次遍历
        ListNode temp = head;
        int size = 0;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        int[] array = new int[size];
        for(int i =size-1;i>=0;i--)
        {
            array[i] = head.val;
            head = head.next;
        }
        return array;
    }

    public static void main(String[] args) {
        S1 que = new S1();
        String ans = que.replaceSpace("we are  the champion");
        System.out.println(ans);
    }
    }


