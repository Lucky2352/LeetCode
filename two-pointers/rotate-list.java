/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static ListNode rev(ListNode head){
        ListNode cur = head, prev = null, front;
        while(cur != null){
            front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
        }
        return prev;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        if(k == 0) return head;
        head = rev(head);
        ListNode first = head;
        ListNode temp2 = head;
        for(int i = 1; i < k; i++){
            temp2 = temp2.next;
        }
        ListNode second = temp2.next;
        temp2.next = null;

        first = rev(first);
        second = rev(second);
        ListNode t = first;
        while(t.next != null){
            t = t.next;
        }
        t.next = second;
        return first;
    }
}