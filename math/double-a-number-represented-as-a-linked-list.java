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
            if(head == null || head.next == null) return head;
            ListNode newHead = rev(head.next);
            ListNode front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
    }
    public ListNode doubleIt(ListNode head) {
        head = rev(head);
        ListNode temp = head;
        int carry = 0;
        while(temp != null){
            int sum = temp.val * 2 + carry;
            temp.val = sum % 10;
            carry = sum/10;
            if(carry > 0 && temp.next == null){
                temp.next = new ListNode(carry);
                carry = 0;
                break;
            }
            temp = temp.next;
        }
        return rev(head);
    }
}