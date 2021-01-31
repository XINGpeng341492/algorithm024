package java0.arthmetic.week1;

import java.util.Arrays;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 6:28 下午
 **/
public class MergeTwoArrs {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,5,0,0,0};
        int[] nums2 = new int[] {3,4,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        while (m > 0 && n > 0) {
            System.out.println("m=: " + m + " n=:" + n);
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n -1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n -1] = nums2[n - 1];
                n --;
            }
        }
        // 当n = 0 m>0 时nums1有剩余已经有序，无需处理
        //当 m =0 n >0时候nums2 有剩余 将nums2中剩余的赋值即可
        for (int i = 0 ; i < n ; i++) {
           nums1[i] = nums2[i] ;
        }



    }
}
