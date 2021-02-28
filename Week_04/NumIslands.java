package com.vipkid.tide.gw.web.arthmetic.week4;

/**
 * <p>TODO
 * </p>
 *
 * @author xingpeng
 * @date 2021/2/28 6:46 下午
 **/
public class NumIslands {

    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid.length == 0) {
            return 0;
        }
        int rowNum = grid.length;
        int colNum = grid[0].length;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == '1') {
                    res ++;
                } else {
                    dfs(grid, i , j, rowNum, colNum);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int row, int col, int rowNum, int colNum) {
        if ( row < 0 || col < 0 || row >= rowNum || col >= colNum || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid,row - 1, col, rowNum, colNum);
        dfs(grid,row + 1, col, rowNum, colNum);
        dfs(grid,row, col -1, rowNum, colNum);
        dfs(grid,row, col + 1, rowNum, colNum);
    }
}
