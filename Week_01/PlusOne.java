package java0.arthmetic.week1;

import java.util.Arrays;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 8:56 下午
 **/
public class PlusOne {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};
        System.out.println(Arrays.toString(plusOne(nums)));

    }


    public static int[] plusOne(int[] nums) {
        //int[] res = new int[nums.length + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = nums[i] + 1;
            nums[i] = nums[i] % 10;
            if (nums[i] != 0) {
                return nums;
            }

        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

}
