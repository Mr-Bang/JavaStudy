/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
//    方法一 递归
    public TreeNode recur(int[] preorder,int[]inorder)
    {
        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length==1)
        {
            return root;
        }
        int leftlen;
        for(leftlen = 0;leftlen<preorder.length;leftlen++)
        {
            if(inorder[leftlen]==preorder[0])
                break;
        }
        // 构建左子树
        if(leftlen>0)
        {
            int[]subpre = new int[leftlen];
            int[]subin = new int[leftlen];
            for(int i = 0;i<leftlen;i++)
            {
                subpre[i] = preorder[i+1];
                subin[i] = inorder[i];
            }
            root.left = recur(subpre,subin);
        }
        else
        {
            root.left = null;
        }
        // 构建右子树
        int rightlen = preorder.length - leftlen -1;
        if(rightlen>0)
        {
            int[] subpre = new int[rightlen];
            int[]subin = new int[rightlen];
            for(int i = 0;i<rightlen;i++)
            {
                subpre[i] = preorder[leftlen+i+1];
                subin[i] = inorder[leftlen+i+1];
            }
            root.right = recur(subpre,subin);
        }
        else
        {
            root.right = null;
        }
        return root;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        if(preorder.length == 0)
        {
            return null;
        }
        return recur(preorder,inorder);

    }
}