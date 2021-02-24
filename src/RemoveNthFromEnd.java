public class RemoveNthFromEnd {
}

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
class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        if(head != null && head.next == null && n==1) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode tmp = slow;

        for(int i = 0; i < n-1; ++i){
            if(fast != null)
                fast = fast.next;
            else
                return null;
        }

        if(fast == null) return null;
        while (fast.next != null){
            fast = fast.next;
            tmp = slow;
            slow = slow.next;
        }

        if (slow == head)
            head = head.next;
        else {
            tmp.next = slow.next;
        }

        return head;
    }
}