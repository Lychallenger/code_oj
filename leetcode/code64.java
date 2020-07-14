package leetcode;

/**
 * @author ：liwan
 * @description：最小路径和
 * @date ：2020/7/14 20:19
 */
public class code64 {
    public int minPathSum(int[][] grid) {
        return getSum(0,0,grid);
    }
    public int getSum(int x,int y,int [][] grid){
        if(x>=grid.length){
            return getSum(x-1,y+1,grid);
        }
        if(y>=grid[0].length){
            return getSum(x+1,y-1,grid);
        }
        if(x==grid.length-1&&y==grid[0].length-1){
            return grid[x][y];
        }
        return grid[x][y]+Math.min(getSum(x+1,y,grid),getSum(x,y+1,grid));
    }
}
