package com.example.graph.leetcode.recursiveDFSBFS;

import com.example.leetcode.tree.TreeNode;

public class FlattenTreeToLinkedList {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
