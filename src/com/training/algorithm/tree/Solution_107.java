package com.training.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by j-yangbo on 2017/4/10.
 *
 *  Binary Tree Level Order Traversal II
 */
public class Solution_107 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next = new LinkedList<>();
        current.add(root);
        while (!current.isEmpty()) {
            TreeNode node = current.remove();
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
            level.add(node.val);
            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<TreeNode>();
                result.add(level);
                level = new ArrayList<>();
            }
        }

        List<List<Integer>> newOrder = new ArrayList<List<Integer>>();
        for (int i = result.size()-1; i >=0; i--) {
            newOrder.add(result.get(i));
        }
        return newOrder;
    }

}
