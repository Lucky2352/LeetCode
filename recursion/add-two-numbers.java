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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ans = new ListNode(0);
        ListNode temp3 = ans;
        int carry = 0;
        while(temp1 != null && temp2 != null){
            int cur = temp1.val + temp2.val + carry;
            carry = cur/10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp3 = temp3.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            int cur = temp1.val + carry;
            carry = cur/10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp3 = temp3.next;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            int cur = temp2.val + carry;
            carry = cur/10;
            ListNode join = new ListNode(cur % 10);
            temp3.next = join;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
        if(carry != 0){
            ListNode join = new ListNode(carry);
            temp3.next = join;
        }
        return ans.next;
    }
}