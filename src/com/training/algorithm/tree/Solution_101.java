package com.training.algorithm.tree;

import java.util.*;

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
        left.right = llright;


        Solution_101 solution = new Solution_101();
        System.out.println("isSymmetric:" + solution.isSymmetric(root));

    }

    /***********************************************
     *
     *
     *              recursive
     *
     *
     ************************************************/
   /* public boolean isSymmetric(TreeNode root) {
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
    }*/

    /***********************************************
     *
     *
     *              iteration
     *
     *
     ************************************************/
    /**
     *  @author Poarry
     * @param root
     * @return
     * 思路 取每层的节点判断对称性
     *
     * note: 用 inValidNode 来标记为空node
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode inValidNode = new TreeNode(0x7fffffff);
        List<TreeNode> currentNode = new LinkedList<>();
        List<TreeNode> levelNode = new LinkedList<>();

        currentNode.add(root);
        while (!currentNode.isEmpty()) {
            TreeNode treeNode = currentNode.remove(currentNode.size()-1);
            if (treeNode.left != null) {
                levelNode.add(treeNode.left);
            } else {
                levelNode.add(inValidNode);
            }
            if (treeNode.right != null) {
                levelNode.add(treeNode.right);
            } else {
                levelNode.add(inValidNode);
            }
            if (currentNode.isEmpty()) {
                if (!checkSymmetric(levelNode)) {
                    return false;
                }
                levelNode.removeIf(p -> p.val==0x7fffffff);
                currentNode = levelNode;
                levelNode = new LinkedList<>();
            }

        }
        return true;
    }

    private boolean checkSymmetric(List<TreeNode> list) {
        int size = list.size();
        if (size == 0) {
            return true;
        }
        if (size % 2 == 1) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (list.get(i).val != list.get(size - 1 - i).val) {
                return false;
            }
        }
        return true;
    }


}
