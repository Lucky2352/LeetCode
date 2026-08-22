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
        ListNode temp = head;
        ListNode prev = null,front = null;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode one = head;
        one = rev(one);
        ListNode dummy = new ListNode(0);
        ListNode two = dummy;
        int max = one.val;
        ListNode prev = null;
        while(one != null){
            if(one.val >= max){
                max = one.val;
                two.next = one;
                two = two.next;
            }
                one = one.next;
        }
        two.next = null;
        return rev(dummy.next);
    }
}