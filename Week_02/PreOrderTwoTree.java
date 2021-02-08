package com.vipkid.tide.gw.web.arthmetic.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/8 5:06 下午
 **/
public class PreOrderTwoTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }


    public void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);

    }






}
