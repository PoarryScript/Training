package com.training.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j-yangbo on 2017/4/10.
 * <p>
 * postorderTraversal
 */
public class Solution_145 {
    List<Integer> nodeList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        nodeList.add(root.val);
        return nodeList;
    }

}
