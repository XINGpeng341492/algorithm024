package java0.arthmetic.week1;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 12:40 下午
 **/
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arrs = new int[] {1,2,2,3,3,4};

        System.out.println(removeDuplicates(arrs));
    }


    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

}
