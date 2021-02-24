import java.util.HashSet;

public class DetectCycle {
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
class Solution_17 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();

        ListNode ptr = head;
        while (ptr != null){
            if(nodes.contains(ptr)){
                return ptr;
            }else {
                nodes.add(ptr);
            }

            ptr = ptr.next;
        }

        return null;
    }
}
