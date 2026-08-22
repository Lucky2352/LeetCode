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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode merg = new ListNode(0);
        ListNode mer = merg;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                mer.next = temp1;
                mer = temp1;
                temp1 = temp1.next;
            }else{
                mer.next = temp2;
                mer = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp2 != null){
            mer.next = temp2;
        }
        if(temp1 != null){
            mer.next = temp1;
        }
        return merg.next;
    }
}