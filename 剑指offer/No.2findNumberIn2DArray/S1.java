//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。
//
//
//
// 示例:
//
// 现有矩阵 matrix 如下：
//
// [
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
//
//
// 给定 target = 5，返回 true。
//
// 给定 target = 20，返回 false。
//
//
//
// 限制：
//
// 0 <= n <= 1000
//
// 0 <= m <= 1000
//
//
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
// Related Topics 数组 双指针
// 👍 124 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//方法一，暴力解法，遍历整个数组即可
//class Solution {
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//
//        if(matrix==null||matrix.length==0||matrix[0].length==0)
//        {
//            return false;
//        }
//        int hl = matrix.length;
//        int ll = matrix[0].length;
//        for (int i = 0; i < matrix.length; i++)
//        {
//            if(target <matrix[i][0]||target> matrix[i][ll-1])
//                continue;
//            for (int j = 0; j <matrix[i].length ; j++)
//            {
//                if(matrix[i][j]==target)
//                    return true;
//            }
//        }
//        return false;
//    }
//}
//方法二，线性查找法
//根据二维数组特点，数组元素从左到右，从上到下依次递增。因此可以从右上角开始寻找target。如果这个位置的数比target大，那么它所处的这一
//列的数字都比要寻找的target大，因此要看列数-1，如果这个位置的数比target小，那么它左边的数字都会比target小，因此看下一行
//也就是行数+1.如果找到了对应的值，就返回true，整个数组查询完没有结果就返回false
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix==null||matrix.length==0||matrix[0].length==0)
        {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns -1;
        while(row<rows&&column>=0)
        {
            if(matrix[row][column] == target)
            {
                return true;
            }
            else if(matrix[row][column]>target)
            {
                column--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
