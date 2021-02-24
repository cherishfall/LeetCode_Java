public class GetIntersectionNode {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution_18 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;

        ListNode PtrA = headA;
        ListNode PtrB = headB;

        while (!(PtrA == null && PtrB == null)){
            if(PtrA == PtrB) return PtrA;

            if(PtrA == null)
                PtrA = headB;
            else
                PtrA = PtrA.next;

            if(PtrB == null)
                PtrB = headA;
            else
                PtrB = PtrB.next;
        }

        return null;
    }
}