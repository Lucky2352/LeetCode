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
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode prev = null;
        ListNode front = null;
        ListNode temp = head;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        ListNode ans = new ListNode(0);
        ListNode temp3 = ans;
        int carry = 0;
        while(temp1 != null && temp2 != null){
            int cur = temp1.val + temp2.val + carry;
            carry = cur / 10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp3 = temp3.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            int cur = temp1.val+ carry;
            carry = cur / 10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        while(temp2 != null){
            int cur = temp2.val + carry;
            carry = cur / 10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
        if(carry != 0){
            ListNode join = new ListNode(carry);
            temp3.next = join;
            
        }
        temp3 = ans;
        ans = temp3.next;
        temp3.next = null;
        ans = reverse(ans);
        return ans;
    }
}