package com.vipkid.tide.gw.web.arthmetic.week4;

import java.util.Arrays;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/23 8:28 下午
 **/
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = s.length - 1;
        for (int j = g.length - 1; j >=0 ; j--) {
            if (i < 0) {
                break;
            }
            if (g[j] <= s[i]) {
                res ++;
                i--;
            }
        }
        return res;
    }

}
