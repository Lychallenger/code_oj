package nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shopee物流会有很多个中转站。在选址的过程中，会选择离用户最近的地方建一个物流中转站。
 *
 * 假设给你一个二维平面网格，每个格子是房子则为1，或者是空地则为0。找到一个空地修建一个物流中转站，使得这个物流中转站到所有的房子的距离之和最小。 能修建，则返回最小的距离和。如果无法修建，则返回 -1。
 *
 *
 * 若范围限制在100*100以内的网格，如何计算出最小的距离和？
 *
 * 当平面网格非常大的情况下，如何避免不必要的计算？
 * 4
 * 0 1 1 0
 * 1 1 0 1
 * 0 0 1 0
 * 0 0 0 0
 *
 * 先输入方阵阶数，然后逐行输入房子和空地的数据，以空格分隔。
 * 8
 *
 * 能修建，则返回最小的距离和。如果无法修建，则返回 -1。
 */
public class OR175 {
    public static int cal_dis(int[]p,int []q){
        return Math.abs(p[0]-q[0])+Math.abs(p[1]-q[1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        ArrayList<int[]> ls=new ArrayList<>();
        ArrayList<int[]> arl=new ArrayList<>();
        int i,j;
        for( i=0;i<n;i++){
            for( j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                    ls.add(new int[]{i, j});
                }
                else{
                    arl.add(new int[]{i,j});
                }
            }

        }
        int min_dis=Integer.MAX_VALUE;
        for(int[]p:ls){
            int dis=0;
            for(int[]q:arl){//cal distance
                dis+=cal_dis(p,q);
            }
            min_dis=Math.min(min_dis,dis);
        }
        if(min_dis!=Integer.MAX_VALUE&&min_dis!=0){
            System.out.println(min_dis);
        }
        else{
            System.out.println(-1);
        }

    }
}
