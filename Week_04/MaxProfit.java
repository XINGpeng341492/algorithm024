package com.vipkid.tide.gw.web.arthmetic.week4;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/23 7:23 下午
 **/
public class MaxProfit {


    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices [i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
