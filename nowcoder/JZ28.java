package nowcoder;

import java.util.HashMap;

/**
 * @author ：liwan012@ke.com
 * @description：JZ28
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @date ：2020/7/11 22:39
 */
class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int max_ct=0;
        int re_value=0;
        for(int value:array){
            if (hashMap.get(value) == null) {
                hashMap.put(value, 1);
            } else {
                hashMap.put(value, hashMap.get(value) + 1);
            }
            if(hashMap.get(value)>max_ct){
                max_ct=hashMap.get(value);
                re_value=value;
            }
        }
        return max_ct>array.length/2?re_value:0;
    }
}
public class JZ28 {
    public static void main(String[] args) {
        int arr []={12,23,4,3,43,4};
        System.out.println(new Solution().MoreThanHalfNum_Solution(arr));
    }
}