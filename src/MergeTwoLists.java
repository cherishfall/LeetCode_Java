public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);

        ListNode tmpPtr = new ListNode(2);
        l1.next = tmpPtr;

        tmpPtr.next = new ListNode(4);
        tmpPtr = tmpPtr.next;

        ListNode l2 = new ListNode(1);

        tmpPtr = new ListNode(3);
        l2.next = tmpPtr;

        tmpPtr.next = new ListNode(4);
        tmpPtr = tmpPtr.next;

        Solution_24  s24 = new Solution_24();
        ListNode head = s24.mergeTwoLists(l1, l2);

        System.out.println();
    }
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


class Solution_24 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode ptrA = l1;
        ListNode ptrB = l2;

        while (!(l1 == null && l2 == null)){ // 这个判断确实有点饶人 l1 != null || l2 != null
            if(l1 != null && l2 != null) {
                if(l1.val <= l2.val){
                    ptrA = l1;
                    l1 = l1.next;

                    tail.next = ptrA;
                    tail = tail.next;
                    tail.next = null;
                }else {
                    ptrB = l2;
                    l2 = l2.next;

                    tail.next = ptrB;
                    tail = tail.next;
                    tail.next = null;
                }
            }else if(l1 != null && l2 == null){
                ptrA = l1;
                l1 = l1.next;

                tail.next = ptrA;
                tail = tail.next;
                tail.next = null;
            }else if (l1 == null && l2 != null){
                ptrB = l2;
                l2 = l2.next;

                tail.next = ptrB;
                tail = tail.next;
                tail.next = null;
            }else
                break;
        }

        return head.next;
    }
}
