package nowcoder;

import java.util.Scanner;

/**
 * 一群孩子做游戏，现在请你根据游戏得分来发糖果，要求如下：
 * 1. 每个孩子不管得分多少，起码分到一个糖果。
 * 2. 任意两个相邻的孩子之间，得分较多的孩子必须拿多一些糖果。(若相同则无此限制)
 * 给定一个数组arr代表得分数组，请返回最少需要多少糖果。
 * [要求]
 * 时间复杂度为O(N)O(N), 空间复杂度为O(1)O(1)
 * 输入描述:
 * 第一行一个整数N表示数组大小
 * 接下来一行N个整数表示数组内的元素
 * 输出描述:
 * 输出一个整数表示答案
 * 示例1
 * 输入
 * 复制
 * 3
 * 1 2 2
 * 输出
 * 复制
 * 4
 * 说明
 * 最优分配方案为1, 2, 1
 */
public class CD77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []dp1=new int[n];
        int []dp2=new int[n];
        int []dp=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        //正向计算
        dp1[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                dp1[i]=dp1[i-1]+1;
            }
            else{
                dp1[i]=1;
            }
        }
        dp2[n-1]=1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1]>arr[i]){
                dp2[i-1]=dp2[i]+1;
            }
            else{
                dp2[i-1]=1;
            }
        }
        int sums=0;
        for(int i=0;i<n;i++){
            dp[i]=Math.max(dp1[i],dp2[i]);
            sums=sums+dp[i];
        }
        System.out.println(sums);
    }
}
