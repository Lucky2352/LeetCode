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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode front = null;
        ListNode prev = null;
        while(slow != null){
            front = slow.next;
            slow.next = prev;
            prev = slow;
            slow = front;
        }
        ListNode temp2 = head;
        while(prev != null){
            if(prev.val != temp2.val)return false;
            prev = prev.next;
            temp2 = temp2.next;
        }
        return true;
    }
}