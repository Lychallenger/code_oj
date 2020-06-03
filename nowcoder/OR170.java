package nowcoder;

import java.util.Scanner;

/**
 * 给定一个仅由小写字母组成的字符串。现在请找出一个位置，删掉那个字母之后，字符串变成回文。请放心总会有一个合法的解。如果给定的字符串已经是一个回文串，那么输出-1。
 * 输入描述:
 * 第一行包含T，测试数据的组数。后面跟有T行，每行包含一个字符串。
 * 输出描述:
 * 如果可以删去一个字母使它变成回文串，则输出任意一个满足条件的删去字母的位置（下标从0开始）。例如：
 *
 * bcc
 *
 * 我们可以删掉位置0的b字符。
 * 示例1
 * 输入
 * 复制
 * 3
 * aaab
 * baa
 * aaa
 * 输出
 * 复制
 * 3
 * 0
 * -1
 */
public class OR170 {
    public  static int get(String s){
        char[]ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(ch[left]==ch[right]){
                left++;
                right--;
                continue;
            }
            else{
                if(right-1>=0&&ch[left]==ch[right-1]){
                    return right;
                }
                else{
                    return left;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result[]=new int[n];
        String []s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
            result[i]=get(s[i]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


}
