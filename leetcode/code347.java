package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author ：liwan
 * @description：leetcode347
 * @date ：2020/7/14 18:34
 */
public class code347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int num:nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue
                =new PriorityQueue<>((Comparator.comparingInt(Map.Entry::getValue)));
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(priorityQueue.size()<k){
                priorityQueue.add(entry);
            }
            else if(priorityQueue.peek().getValue()<entry.getValue()){
                priorityQueue.poll();
                priorityQueue.add(entry);
            }
        }
        int[] result=new int[k];
        int i=0;
        for(Map.Entry<Integer, Integer> maps:priorityQueue){
            result[i]=maps.getKey();
            i++;
        }
        return result;
    }
}
