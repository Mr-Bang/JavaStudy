//找出数组中重复的数字。
//
//
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//
//示例 1：
//
//输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3

package No1findRepeatNumber;

class Solution {
//    方法1，哈希表。通过set.add()函数，如果里面已经有这个元素了，那么说明这个数字就是要寻找的重复数字
//    这个方法时间复杂度为O(n)，但空间复杂度也为O(n)（因为使用了一个哈希表）
//
//    public int findRepeatNumber(int[] nums)
//    {
//        int res = -1;
//        if(nums== null)
//        {
//            res=-1;
//            return res;
//        }
//        for(int num:nums)
//    {
//        if(num>nums.length||num<0)
//        {
//            return -1;
//        }
//    }
//        Set<Integer> set = new Set<Integer>();
//        for(int num:nums)
//        {
//            if(!set.add(num))
//            {
//                res = num;
//                break;
//            }
//        }
//        return res;
//
//    }
//    方法2，swap
//    因为这个长度为n的数组里的数字大小都不超过n-1,因此如果没有重复元素，那么这个数组顺序排列后，每个数字
//    应该它的index一致，利用这个特性可以采用更好的方法。
//    从头到尾依次扫描这个数组，当碰到下标为i的数字时，首先判断这个数字是不是等于i，如果等于就看下一个
//    如果不等于那么假设这个数字为m，去看下标为m的数字是不是也为m，如果为m，那么就找到了重复的数字，如果
//    下标为m的数字也不等于m，那么就让这两个数字相互交换，使得下标为m的数字等于m，然后接着往后面进行
//    这个样子相当于对这个数组进行了一个排序（从后面往前面）。
//    这个方法时间复杂度为O(n),空间复杂度为O(1)（因为所有的操作都是在数组上进行的，不用开辟新的空间）
//    public void swap(int[] nums,int i,int j)
//    {
//        int temp = nums[i];
//        nums[i]=nums[j];
//        nums[j] = temp;
//    }
//    public int findRepeatNumber(int[] nums)
//    {
////        判断数组是否为空
//        if(nums== null)
//        {
//            return -1;
//        }
////        判断数组是否符合条件
//        for(int num:nums)
//        {
//            if(num>=nums.length||num<0)
//            {
//                return -1;
//            }
//        }
//        for (int i = 0; i < nums.length ; i++)
//        {
//            while(nums[i]!=i)
//            {
//                if(nums[nums[i]]==nums[i])
//                {
//                    return nums[i];
//                }
//                else
//                {
//                    swap(nums,i,nums[i]);
//                }
//            }
//        }
//        return -1;
//    }
//    方法3. 二分法
    public int getCount(int[] nums,int start,int end)
    {
        int count = 0;
        if(nums==null)
        {
            return 0;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]>=start&&nums[i]<=end)
            {
                count++;
            }
        }
        return count;
    }
    public int findRepeatNumber(int[] nums)
    {
        int start = 1;
        int end = nums.length - 1;
        while(end>=start)
        {
//            (x & y) + ((x ^ y) >> 1)可以计算x和y的平均值
            int middle = (end & start) + ((end ^ start) >> 1);
            int count = getCount(nums,start,middle);
            if(end == start)
            {
                if(count > 1)
                {
                    return start;
                }
                else
                {
                    break;
                }
            }
            if(count > (start -middle +1))
            {
                end = middle;
            }
            else{
                start = middle;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {2,3,5,4,3,2,6,7,};
        int res = s.findRepeatNumber(a);
        System.out.println(res);
    }
}