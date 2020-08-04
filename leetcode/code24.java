package leetcode;

/**
 * @author ：liwan012
 * @description：两两交换链表中的节点
 * @date ：2020/8/4 16:20
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val=x;
    }
}
public class code24 {
    public ListNode swapPairs(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return head;
    }
}
