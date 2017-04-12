package com.training.algorithm.tree;

import com.training.algorithm.Utils;

import java.util.*;

/**
 * Created by j-yangbo on 2017/4/12
 * <p>
 * <p>
 * Find Largest Value in Each Tree Row.
 */
public class Solution_515 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(10);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(20);
        TreeNode llright = new TreeNode(20);
        right.right = lright;
        llright.left = llright;

        Solution_515 solution = new Solution_515();


        List<Integer> result = solution.largestValues(root);
        Utils.printIntegerList(result);
    }

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> values = new ArrayList<>();

        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        List<Integer> levelList =new ArrayList<>();


        current.add(root);

        while (!current.isEmpty()) {
            TreeNode node = current.remove();
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
            if (levelList.isEmpty()) {
                levelList.add(node.val);
            }else {
                int currentvlaue =levelList.get(0);
                if(currentvlaue<node.val){
                    levelList.clear();
                    levelList.add(node.val);
                }
            }
            if (current.isEmpty()) {

                values.add(levelList.get(0));
                current = next;
                next = new LinkedList<>();
                levelList = new ArrayList<>();
            }
        }
        return values;
    }


}
