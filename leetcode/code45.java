package leetcode;

//效率低
class Solution45 {
    public int jump(int[] nums) {
        int[] dp =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            while(t>0){
                if(i+t<nums.length){
                    dp[i+t]=Math.min(dp[i+t],dp[i]+1);
                }
                t--;
            }

        }
//        for(int i=0;i<nums.length;i++){
//            System.out.println(dp[i]);
//        }
        return dp[nums.length-1];
    }
}
public class code45 {
    public static void main(String[] args) {
        Solution45 s=new Solution45();
        int r=s.jump(new int[]{3,2,1});
        System.out.println(r);

    }
}
