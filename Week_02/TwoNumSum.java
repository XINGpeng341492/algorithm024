package com.vipkid.tide.gw.web.arthmetic.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/7 7:46 下午
 **/
public class TwoNumSum {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,7,9,13};
        System.out.println(Arrays.toString(twoSum(arr, 16)));

    }


    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res = new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return res;
    }


}
