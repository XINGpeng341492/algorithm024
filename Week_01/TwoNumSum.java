package java0.arthmetic.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.sun.tools.javac.code.Attribute;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/1/31 8:36 下午
 **/
public class TwoNumSum {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,5,7,11};

        System.out.println(Arrays.toString(twoSum(arr, 13)));

    }


    public static int[] twoSum(int[] arr, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i ++) {
            if (indexMap.containsKey(target - arr[i])) {
                res = new int[] {indexMap.get(target - arr[i]), i};
                break;
            } else {
                indexMap.put(arr[i], i);
            }
        }

       return res;

    }

}
