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
public class InOrderTwoTree {

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


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }


    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }






}
