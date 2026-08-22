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
    public static ListNode sort(ListNode head){
        if(head == null || head.next == null)return head;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        Collections.sort(list);
        for(int num = 0;num < list.size();num++){
            temp.val = list.get(num);
            temp = temp.next;
        }
        return head;
    }
    public ListNode insertionSortList(ListNode head) {
       return sort(head); 
    }
}