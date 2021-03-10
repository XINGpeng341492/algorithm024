package com.vipkid.tide.gw.web.arthmetic.week5;

/**
 * <p>
 *     dp[i][j] ---> 以该点为右下角的最大正方形边长 对应点：matrix[i -1][j -1]
 *     当 dp[i][j] == '1' 时候 dp[i][j] = Min(dp[i - 1][j], dp[i][j - 1],dp[i - 1][j - 1]) + 1
 * </p>
 *
 * @author xingpeng
 * @date 2021/3/10 5:38 下午
 **/
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return 0;
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int maxSide = 0;
        // 相当于已经预处理新增第一行、第一列均为0
        int[][] dp = new int[height + 1][width + 1];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (matrix[row][col] == '1') {
                    dp[row + 1][col + 1] = Math.min(Math.min(dp[row + 1][col], dp[row][col + 1]), dp[row][col]) + 1;
                    maxSide = Math.max(maxSide, dp[row + 1][col + 1]);
                }
            }
        }
        return maxSide * maxSide;

    }

}
