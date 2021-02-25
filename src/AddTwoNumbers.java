public class AddTwoNumbers {
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
class Solution_25 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode ptrA = l1, ptrB = l2, tmp;
        int val = 0, cnt = 0;

        while (!(ptrA == null && ptrB == null)){
            if(ptrA != null && ptrB != null) {
                val = ptrA.val + ptrB.val + cnt;
                ptrA = ptrA.next;
                ptrB = ptrB.next;
            }else if(ptrA != null && ptrB == null){
                val = ptrA.val + cnt;
                ptrA = ptrA.next;
            }else if (ptrA == null && ptrB != null){
                val = ptrB.val + cnt;
                ptrB = ptrB.next;
            }else
                break;

            if(val >= 10){
                val = val -10;
                cnt = 1;
            }else {
                cnt = 0;
            }
            tmp = new ListNode(val);
            tail.next = tmp;
            tail = tail.next;
        }
        if(cnt == 1){
            tmp = new ListNode(1);
            tail.next = tmp;
            tail = tail.next;
        }

        return head.next;
    }
}