package com.vipkid.tide.gw.web.arthmetic.week3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/17 2:24 下午
 **/
public class Permute {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        //Solution solution = new Solution();
        List<List<Integer>> lists = new Permute().permute(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        Deque<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, nums.length, 0, used, path, res);
        return res;

    }

    private void dfs(int[] nums, int length, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if(!used[i]) {
                used[i] = true;
                path.offer(nums[i]);
                dfs(nums, length, depth + 1, used, path, res);
                used[i] = false;
                path.removeLast();
            }
        }
    }

}
