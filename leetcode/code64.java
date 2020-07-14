package leetcode;

/**
 * @author ：liwan
 * @description：最小路径和
 * @date ：2020/7/14 20:19
 */
public class code64 {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (j == 0 && i != 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                }
                else if(i==0&&j==0){

                }
                else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]);
                }

            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

}
