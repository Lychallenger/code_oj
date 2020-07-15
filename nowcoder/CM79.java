package nowcoder;

import java.util.PriorityQueue;

/**
 * @author ：liwan012@ke.com
 * @description：middle number
 * @date ：2020/7/15 19:57
 */
public class CM79 {
    public static int[] getMiddle(int[] A, int n) {
        // write code here
        int [] result=new int[n];
        PriorityQueue<Integer> priorityQueueSmall=new PriorityQueue<>((o1, o2) -> o2-o1);
        PriorityQueue<Integer> priorityQueueBig = new PriorityQueue<>((o1, o2) -> o1-o2);
        int i=0;
        for(int value:A){
            if(priorityQueueSmall.size()>priorityQueueBig.size()){
                priorityQueueSmall.offer(value);
                int tmp=priorityQueueSmall.poll();
                priorityQueueBig.add(tmp);
            }
            else{
                priorityQueueBig.add(value);
                int tmp=priorityQueueBig.poll();
                priorityQueueSmall.add(tmp);
            }
            result[i]=priorityQueueSmall.peek();
            i++;

        }
        return  result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        getMiddle(arr,arr.length);
    }
}
