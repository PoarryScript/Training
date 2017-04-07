package com.training.algorithm.tree;

/**
 * Created by j-yangbo on 2017/4/7.
 * <p>
 * Balanced Binary Tree
 */
public class Sulotion_110 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l2 = new TreeNode(9);
        TreeNode r2 = new TreeNode(20);
        TreeNode r3l = new TreeNode(15);
        TreeNode r5r = new TreeNode(7);


        root.left = l2;
        root.right = r2;
        r2.left = r3l;
        r2.right = r5r;

        Sulotion_110 sulotion = new Sulotion_110();

        System.out.println(" isBalanced "+        sulotion.isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {

        if (maxDepthDiffer(root) <2&&maxDepthDiffer(root)>-2) {
            return true;
        } else {
            return false;
        }

    }

    public int maxDepthDiffer(TreeNode root) {
        return root == null ? 0 : maxDepthDiffer(root.left) - maxDepthDiffer(root.right);

    }


}