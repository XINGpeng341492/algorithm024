package com.vipkid.tide.gw.web.arthmetic.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/7 11:06 下午
 **/
public class PreOrderNTree {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;

    }

    public void dfs(Node root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            List<Node> children = root.children;
            for (Node node : children) {
                dfs(node, res);
            }
        }
    }





}
