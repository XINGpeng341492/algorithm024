package com.vipkid.tide.gw.web.arthmetic.week5;

/**
 * <p>
 *     1.暴力  n^2
 *     2.DP:
 *       a.分治子问题  max_sum(i) = Max(max_sum(i - 1), 0) + a[i];
 *       b.状态数组定义 f[i]
 *       c.DP方程
 *         f[i] =Max(f[i-1],0) + a[i];
 * </p>
 *
 * @author xingpeng
 * @date 2021/3/4 3:20 下午
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
            res = Math.max(dp[i],res);
        }

        return res;


    }

}
