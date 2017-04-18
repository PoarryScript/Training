package com.training.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by j-yangbo on 2017/4/10.
 * <p>
 * Validate Binary Search Tree
 */
public class Solution_98 {
    public static void main(String[] args) {
        Solution_98 solution = new Solution_98();
       /*  TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);
        root.left = left;
        root.right = right;
        TreeNode lright = new TreeNode(6);
        TreeNode llright = new TreeNode(20);
        right.left = lright;
        lright.right = llright;*/

        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

//        solution.inOrder(root);

        boolean isValid = solution.isValidBST(root);
        System.out.println("isValid:" + isValid);

        solution.inOrderIteration(root);
    }


    /**
     * 由于树的定义是递归的，所以只需要判断当前的节点是否在一个取值区间
     *
     * @param root
     * @return
     */
  /*  public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode node, double min, double max) {
        if (node == null) {
            return true;
        }
        if(node.val <= min || node.val >= max ){
            return false;
        }
        return  isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }*/


    /**
     * 根据BST的属性 中序遍历 判断节点大小递增则为valid
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> nodeList = inOrderIteration(root);

        for (int i = 0; i < nodeList.size()-1; i++) {
            if (nodeList.get(i)>=nodeList.get(i+1)){
                return false;
            }
        }
        return true;

    }


    private List<Integer> inOrderIteration(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        List<Integer> nodeList =new ArrayList<>();
        Stack<TreeNode> unVisitNode = new Stack<>();
        TreeNode node = treeNode;

        while (node != null) {
            unVisitNode.push(node);
            node = node.left;
        }
        while (unVisitNode.size() > 0) {
            node = unVisitNode.pop();
//            System.out.println("nodeValue-->" + node.val);
            nodeList.add(node.val);
            if (node.right != null) {
                node = node.right;

                while (node != null) {
                    unVisitNode.push(node);
                    node = node.left;
                }
            }
        }
        return nodeList;
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
