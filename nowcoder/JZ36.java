package nowcoder;

import java.util.Stack;

/**
 * @author ：liwan
 * @description：两个链表公共节点
 * @date ：2020/7/14 14:27
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class JZ36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Stack<Integer> integerStack1=new Stack<>();
        Stack<Integer> integerStack2=new Stack<>();
        ListNode preHead=pHead1;
        while(pHead1!=null){
            integerStack1.push(pHead1.val);
            pHead1=pHead1.next;
        }
        while(pHead2!=null){
            integerStack2.push(pHead2.val);
            pHead2=pHead2.next;
        }
        int pre=0;
        while(!integerStack1.empty()&&!integerStack2.empty()&&integerStack1.peek().equals(integerStack2.peek())){
            pre=integerStack1.peek();
            integerStack1.pop();
            integerStack2.pop();
        }
        while (preHead!=null){
            if(preHead.val==pre){
                break;
            }
            preHead=preHead.next;
        }
        return preHead;
    }
}
