package com.vipkid.tide.gw.web.arthmetic.week3;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/16 9:56 下午
 **/
public class LastestCommonAncestor {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p , q);
        TreeNode right = lowestCommonAncestor(root.right, p , q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;

    }
}
