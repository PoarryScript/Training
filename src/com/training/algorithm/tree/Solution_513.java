package com.training.algorithm.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by j-yangbo on 2017/4/13.
 * 513. Find Bottom Left Tree Value Add to List
 * DescriptionSubmissionsSolutions
 * Total Accepted: 11786
 * Total Submissions: 21220
 * Difficulty: Medium
 * Contributors:
 * abhijeet17
 * Given a binary tree, find the leftmost value in the last row of the tree.
 * <p>
 * Example 1:
 * Input:
 * <p>
 * 2
 * / \
 * 1   3
 * <p>
 * Output:
 * 1
 * Example 2:
 * Input:
 * <p>
 * 1
 * / \
 * 2   3
 * /   / \
 * 4   5   6
 * /
 * 7
 * <p>
 * Output:
 * 7
 */
public class Solution_513 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(-1);
//        root.left = left;
        root.right = right;

       /* TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(5);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(0);
        TreeNode llright = new TreeNode(2);
        left.left = lright;
        left.right = llright;


        TreeNode lrright = new TreeNode(4);
        TreeNode rrright = new TreeNode(6);
        right.left = lrright;
        right.right = rrright;*/

        Solution_513 solution = new Solution_513();

        System.out.println("findBottomLeftValue:"+solution.findBottomLeftValue(root));
    }

    public int findBottomLeftValue(TreeNode root) {
        if (root.left==null &&root.right==null){
            return root.val;
        }
        int leftNodeValue = Integer.MIN_VALUE;
        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();

        current.add(root);

        while (!current.isEmpty()) {
            TreeNode node = current.remove();
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
            if (current.isEmpty()) {
                if (!next.isEmpty()){
                    leftNodeValue =printTreeNode(next);
                }
                current = next;
                next = new LinkedList<>();
            }
        }

        return leftNodeValue;
    }

    private int printTreeNode(Queue<TreeNode> next) {

        Iterator<TreeNode> iterator = next.iterator();
       return iterator.next().val;
    }


}
