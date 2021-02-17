package com.vipkid.tide.gw.web.arthmetic.week3;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/16 10:08 下午
 **/
public class BuildMyTree {

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    Map<Integer, Integer> rootIndexMap = new HashMap<>();


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i = 0; i < inorder.length; i++) {
            rootIndexMap.put(inorder[i], i);
        }
        System.out.println(rootIndexMap.size());
        return buildMyTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode buildMyTree(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if (pl > pr || il > ir) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pl]);
        int rootIndex = rootIndexMap.get(preorder[pl]);
        // x - (pl + 1) = rootIndex - 1 - il
        int x  = rootIndex - il + pl;
        root.left = buildMyTree(preorder, inorder, pl + 1, x, il, rootIndex - 1);
        root.right = buildMyTree(preorder, inorder, x + 1, pr, rootIndex + 1, ir);
        return root;

    }

}
