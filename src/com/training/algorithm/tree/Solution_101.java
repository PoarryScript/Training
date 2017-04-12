package com.training.algorithm.tree;

/**
 * Created by j-yangbo on 2017/4/12.
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * <p>
 * <p>
 * <p>
 * Symmetric Tree
 */

public class Solution_101 {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(10);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(20);
        TreeNode llright = new TreeNode(20);
        right.right = lright;
        left.left = llright;


        Solution_101 solution = new Solution_101();
        System.out.println("isSymmetric:" + solution.isSymmetric(root));

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null && rightNode != null) {
            return false;
        }
        if (leftNode != null && rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return (checkSymmetric(leftNode.left, rightNode.right) && checkSymmetric(rightNode.left, leftNode.right));
    }
}
