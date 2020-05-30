package leetcode;

import java.util.Stack;

//接雨水用单调栈解决
class Solutions {
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
        int sums=0;
        Stack<Integer> st=new Stack<Integer>();
        int i=0;
        int temp_sum;
        while(i<height.length){
           while(!st.empty()&&height[i]>height[st.peek()]){
                int pre_id=st.peek();
                st.pop();
                if(st.empty())break;
                int dis=i-st.peek()-1;
                temp_sum=dis*(Math.min(height[i],height[st.peek()])-height[pre_id]);
                sums+=temp_sum;

           }
           st.push(i);
           i++;
        }
        return sums;
    }
}
public class code42_stack {
    public static void main(String[] args) {
        Solutions s=new Solutions();
        int r=s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(r);
    }

}
