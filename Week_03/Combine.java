package com.vipkid.tide.gw.web.arthmetic.week3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/16 10:48 下午
 **/
public class Combine {

    public static void main(String[] args) {
        List<List<Integer>> res = new Combine().combine(4, 2);
        System.out.println(Arrays.toString(res.toArray()));
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new LinkedList<>();
        dfs(n, k, 1, path, res);
        return res;
    }

    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i ++) {
            path.offer(i);
            dfs(n, k, i + 1, path, res);
            path.removeLast();
        }


    }


}
