package com.training.algorithm.tree;

import java.util.*;

/**
 * Created by j-yangbo on 2017/4/13.
 * <p>
 * 199. Binary Tree Right Side View
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * For example:
 * Given the following binary tree,
 * 1            <---
 * /   \
 * 2     3         <---
 * \     \
 * 5     4       <---
 * You should return [1, 3, 4].
 */
public class Solution_199 {

    public static void main(String[] args) {


        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        node0.left = node1;
        node0.right = node2;
        node1.right = node3;
        node2.right = node4;

        Solution_199 solution = new Solution_199();

        System.out.println("" + solution.rightSideView(node0));

    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> rightSideList = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();

        current.add(root);
        rightSideList.add(root.val);
        while (!current.isEmpty()) {
            TreeNode node = current.remove();

            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
            if (current.isEmpty()) {

                current = next;
                if (!next.isEmpty()) {
                    rightSideList.add(getrightSideViewNode(next));
                }
                next = new LinkedList<>();

            }

        }

        return rightSideList;
    }

    private Integer getrightSideViewNode(Queue<TreeNode> next) {
        if (next == null) {
            return 0;
        }
        Iterator<TreeNode> iterator = next.iterator();
        int result = iterator.next().val;
        while (iterator.hasNext()) {
            result = iterator.next().val;
        }
        return result;
    }

}
