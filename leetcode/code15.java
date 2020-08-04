package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：liwan012
 * @description：三数之和
 * @date ：2020/8/4 15:45
 */
public class code15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ls=new HashSet<>();
        for(int i=0;i< nums.length;i++){
            int j=i+1;
            int k= nums.length-1;
            while(j<k){
                if(nums[j]+ nums[k]==-nums[i]){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    ls.add(list);
                }
                else if(nums[j]+nums[k]>-nums[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ls.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};
        List<List<Integer>> re=new code15().threeSum(arr);
    }
}
