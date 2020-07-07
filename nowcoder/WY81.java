package nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ：liwan012@ke.com
 * @description：模数求和问题
 * @date ：2020/7/7 12:12
 */
public class WY81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i]-1;
        }
        System.out.println(sum);
    }



}
