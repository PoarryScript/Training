package com.training.algorithm.tree;

import java.util.Stack;

/**
 * Created by j-yangbo on 2017/4/19.
 * <p>
 * 114. Flatten Binary Tree to Linked List
 * <p>
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example,
 * Given
 * <p>
 * 1
 * / \
 * 2   5
 * / \   \
 * 3   4   6
 * The flattened tree should look like:
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 */
public class Solution_114 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(5);
        root.left = left;
        root.right = right;

        TreeNode lleft = new TreeNode(3);
        TreeNode lright = new TreeNode(4);
        left.left = lleft;
        left.right = lright;

        TreeNode rright = new TreeNode(6);
//        TreeNode rleft = new TreeNode(20);
        right.right = rright;

        Solution_114 solution = new Solution_114();
        solution.flatten(root);

    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode currentTreeNode = root;
        Stack<TreeNode> stack = new Stack<>();

        while (currentTreeNode != null||!stack.isEmpty()) {
            if (currentTreeNode.right != null) {
                stack.push(currentTreeNode.right);
            }
            if (currentTreeNode.left != null) {
                currentTreeNode.right =currentTreeNode.left;
                currentTreeNode.left =null;
            }else if (!stack.isEmpty()){
                TreeNode treeNode = stack.pop();
                currentTreeNode.right=treeNode;
            }
            currentTreeNode = currentTreeNode.right;

        }



    }

    private void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.left);
        System.out.println("node " + treeNode.val);
        inOrder(treeNode.right);
    }

    private void preOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println("node " + treeNode.val);
        preOrder(treeNode.left);
        preOrder(treeNode.right);

        System.out.println("" + treeNode.val);
    }
}
