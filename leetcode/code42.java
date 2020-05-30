package leetcode;

//接雨水
class Solution {
    public int trap(int[] height) {
        if(height.length==0){
            return 0;
        }
        else if(height.length==1){
            return 0;
        }
        else if(height.length==2){
            return 0;
        }
        int [] leftmax=new int[height.length];
        int [] rightmax=new int[height.length];
        leftmax[0]=height[0];
        rightmax[height.length-1]=height[height.length-1];
        int temp_max=height[0];
        for(int i=1;i<height.length;i++){
                if(height[i]>temp_max){
                    temp_max=height[i];
                }
                leftmax[i]=temp_max;
        }
        temp_max=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
             if(height[i]>temp_max){
                 temp_max=height[i];
             }
             rightmax[i]=temp_max;
        }
        int sums=0;
        for(int i=1;i<height.length-1;i++){
            if(leftmax[i-1]>height[i]&&rightmax[i+1]>height[i]){
                sums+=Math.min(leftmax[i-1],rightmax[i+1])-height[i];
            }
        }
        return sums;
    }
}
public class code42 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int r=s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(r);
    }
}
