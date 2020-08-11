package nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/28c1dc06bc9b4afd957b01acdf046e69?f=discussion
 * 来源：牛客网
 *
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
 * 输出需要删除的字符个数。
 *
 * 输入描述:
 *
 * 输入数据有多组，每组包含一个字符串s，且保证:1<=s.length<=1000.
 *
 *
 *
 *
 * 输出描述:
 *
 * 对于每组数据，输出一个整数，代表最少需要删除的字符个数。
 *
 * 示例1
 * 输入
 * abcda
 * google
 * 输出
 * 2
 * 2
 * @author ：liwan012@ke.com
 * @description：DP 动态规划问题
 * @date ：2020/8/11 17:07
 */
public class DP_1 {
    public static int get(String s){
        int [][]dp=new int[s.length()+1][s.length()+1];
        for(int len=0;len<s.length();len++){
            for(int i=0;i+len<s.length();i++){
                if(len==0){
                    dp[i][i+len]=0;
                }
                else if(len==1){
                    if(s.charAt(i)==s.charAt(i+len)){
                        dp[i][i+len]=0;
                    }
                    else{
                        dp[i][i+len]=1;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(i+len)){
                        dp[i][i+len]=dp[i+1][i+len-1];
                    }
                    else{
                        dp[i][i+len]=Math.min(dp[i+1][i+len]+1,dp[i][i+len-1]+1);
                    }
                }
            }
        }
        return dp[0][s.length()-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(sc.hasNext()) {
            String tmp=sc.nextLine();
            arrayList.add(get(tmp));
        }
        for(Integer t:arrayList){
            System.out.println(t);
        }
    }
}
