package java0.arthmetic.week1;

import java.util.Arrays;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 8:46 下午
 **/
public class MoveZero {
    public static void main(String[] args) {
        int[] nums = new int[] {1,0,3,0,5,6};
        moveZero(nums);

        System.out.println(Arrays.toString(nums));
    }


    public static void moveZero(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }

    }


}
