package com.training.algorithm.tree;

import com.training.algorithm.Utils;
import com.training.algorithm.math.Solution_2;

import java.util.*;

/**
 * Created by j-yangbo on 2017/4/17.
 * <p>
 * <p>
 * <p>
 * 103. Binary Tree Zigzag Level Order Traversal
 * <p>
 * <p>
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its zigzag level order traversal as:
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 */
public class Solution_103 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(7);
        TreeNode llright = new TreeNode(15);
        right.right = lright;
        right.left = llright;


        Solution_103 solution = new Solution_103();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        for (int i = 0; i < result.size(); i++) {
            Utils.printIntegerList(result.get(i));
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<Integer> levelList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        int currentLevel = 0;
        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        Stack<Integer> stackForReserve = new Stack<>();
        current.add(root);
        while (!current.isEmpty()) {
            TreeNode node = current.remove();
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
            if (currentLevel % 2 == 0) {
                levelList.add(node.val);
            } else {
                stackForReserve.push(node.val);
            }
            if (current.isEmpty()) {
                current = next;
                if (currentLevel % 2 == 1) {
                    while (!stackForReserve.isEmpty()) {
                        levelList.add(stackForReserve.pop());
                    }
                }
                result.add(levelList);
                next = new LinkedList<>();
                levelList=new ArrayList<>();
                stackForReserve =new Stack<>();
                currentLevel++;
            }
        }
        return result;
    }


}
