package nowcoder;

import java.util.Scanner;

/**
 * 输入一个整形数组（可能有正数和负数），求数组中连续子数组（最少有一个元素）的最大和。要求时间复杂度为O(n)。
 *
 * 输入描述:
 * 【重要】第一行为数组的长度N（N>=1）
 *
 * 接下来N行，每行一个数，代表数组的N个元素
 * 输出描述:
 * 最大和的结果
 * 示例1
 * 输入
 * 复制
 * 8
 * 1
 * -2
 * 3
 * 10
 * -4
 * 7
 * 2
 * -5
 * 输出
 * 复制
 * 18
 * 说明
 * 最大子数组为 3, 10, -4, 7, 2
 */
public class OR176 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []dp=new int[n];
        int max_num=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(i!=0){
                dp[i] = Math.max(arr[i] + dp[i - 1], arr[i]);
            }
            else{
                dp[i]=arr[i];
            }
            max_num=Math.max(max_num,dp[i]);

        }
        System.out.println(max_num);

    }
}
