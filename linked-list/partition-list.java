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
    public ListNode partition(ListNode head, int x) {
       ListNode less = new ListNode(0);
       ListNode more = new ListNode(0);

       ListNode temp1 = less;
       ListNode temp2 = more;

       while(head != null){
        if(head.val >= x){
            temp2.next = head;
            temp2  = temp2.next;
        }else{
            temp1.next = head;
            temp1 = temp1.next;
        }
        head = head.next;
       }
       temp2.next = null;
       temp1.next = more.next;
       
       return less.next;
    }
}