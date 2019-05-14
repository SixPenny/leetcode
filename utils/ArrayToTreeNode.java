package com.dylan.leetcode.util;

import com.dylan.leetcode.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * util class to convert an array to tree
 */
public class ArrayToTreeNode {

    public static TreeNode to(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        TreeNode root = new TreeNode(array[0]);
        queue.add(root);
        for (int i = 1; i < array.length; i+=2) {
            TreeNode r = queue.remove();
            if (array[i] != null) {
                r.left = new TreeNode(array[i]);
                queue.add(r.left);
            }
            if (i + 1 < array.length && array[i + 1] != null) {
                r.right = new TreeNode(array[i + 1]);
                queue.add(r.right);
            }
        }

        return root;
    }
}
