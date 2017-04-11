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
        right.right = lright;
        lright.right = llright;


        boolean isValid = solution.isValidBST(root);
        System.out.println("isValid:" + isValid);

        solution.inOrderTree(root,root.val);
    }

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }
        int preNodeValue = root.val;
//        return inOrderTree(root, preNodeValue);
        return true;
    }

    private void inOrderTree(TreeNode root, int preNodeValue) {
        if (root == null) {
            return ;
        }
        inOrderTree(root.left, root.left.val) ;
//        viaNode(root);
        System.out.println("root value:"+root.val);
        System.out.println("preNodeValue:"+preNodeValue);
        inOrderTree(root.right, root.right.val);

        return ;
    }

    private boolean viaNode(TreeNode root) {
        boolean isValidNode = false;
        if (root.left != null) {
            isValidNode = root.left.val < root.val;
        }
        if (root.right != null) {
            isValidNode = root.right.val > root.val;
        }
        return isValidNode;
    }
}
