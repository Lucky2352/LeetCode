class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        ListNode Dummy = new ListNode(0);
        ListNode temp2 = Dummy;
        while (temp != null) {
            int cur = temp.val;
            int count = 0;
            while (temp != null && temp.val == cur) {
                count++;
                temp = temp.next;
            }
            if (count == 1) {
                temp2.next = new ListNode(cur);
                temp2 = temp2.next;
            }
        }
        return Dummy.next;
    }
}