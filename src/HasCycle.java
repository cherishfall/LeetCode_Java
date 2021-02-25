public class HasCycle {
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



class Solution_16 {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr = head, slowPtr = head;

        while (fastPtr != null && fastPtr.next != null && slowPtr != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr){
                return true;
            }
        }

        return false;
    }
}
