package com.vipkid.tide.gw.web.arthmetic.week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/8 6:05 下午
 **/
public class BFSNTree {

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

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        int num = queue.size();
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            num --;
            Node rootNode = queue.poll();
            list.add(rootNode.val);
            List<Node> children = rootNode.children;
            for (Node node : children) {
                queue.offer(node);
            }
            if (num == 0) {
                res.add(list);
                num = queue.size();
                list = new ArrayList<>();
            }
        }
        return res;

    }


}
