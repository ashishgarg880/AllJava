package com.TreeNde;

public class SameNode {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        while (p != null && q != null) {
            if (p.val == q.val) {
                isSameTree(p.left, q.left);
                isSameTree(p.right, q.right);
            } else {
                return false;
            }
        }
        return true;
    }
}
