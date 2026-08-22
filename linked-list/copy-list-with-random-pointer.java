/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t1 = new Node(temp.val);
            t1.next = temp.next;
            temp.next = t1;
            temp = temp.next.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node Dummy = new Node(-1);
        Node t2 = Dummy;
        while (temp != null) {
            t2.next = temp.next;
            t2 = t2.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return Dummy.next;
    }
}