package com.training.algorithm.tree;

/**
 * Created by j-yangbo on 2017/4/10.
 * <p>
 * Validate Binary Search Tree
 */
public class Solution_98 {
    public static void main(String[] args) {
        Solution_98 solution = new Solution_98();
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(6);
        TreeNode llright = new TreeNode(20);
        right.left = lright;
        lright.right = llright;

//        solution.inOrder(root);

        boolean isValid = solution.isValidBST(root);
        System.out.println("isValid:" + isValid);

    }

    int rootValue;

    public boolean isValidBST(TreeNode root) {


        if (root == null) {
            return true;
        }
        rootValue = root.val;
        return viaNode(root.val, root.left, root.right);
    }

    private boolean viaNode(int val, TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null) {
            if (right.val <= val || right.val <= rootValue) {
                return false;
            }
            return viaNode(right.val, right.left, right.right);
        }
        if (right == null && left != null) {
            if (left.val >= val || left.val >= rootValue) {
                return false;
            }
            return viaNode(left.val, left.left, left.right);
        }
        if (left != null && right != null) {
            return viaNode(right.val, right.left, right.right) && viaNode(left.val, left.left, left.right);
        }
        return true;
    }

    private void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.left);
        System.out.println("node " + treeNode.val);
        inOrder(treeNode.right);
    }

}
