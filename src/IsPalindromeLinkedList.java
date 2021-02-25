import java.util.List;

public class IsPalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode tmpPtr = new ListNode(2);
        head.next = tmpPtr;

        tmpPtr.next = new ListNode(2);
        tmpPtr = tmpPtr.next;

        tmpPtr.next = new ListNode(1);
        tmpPtr = tmpPtr.next;


        Solution_23 s23 = new Solution_23();
        s23.isPalindrome(head);

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
class Solution_23 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null) return true;

        ListNode fast = head;
        ListNode slow = head;
        int count = 0;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }

        ListNode ptrA = slow;
        ListNode ptrB = slow.next;
        while (ptrB != null){
            ptrA.next = ptrB.next;
            ptrB.next = slow;
            slow = ptrB;

            ptrB = ptrA.next;
        }


        ptrA = head;
        ptrB = slow;
        for(int i = 0; i < count; ++i){
            if(ptrA.val != ptrB.val)
                return false;
            else {
                ptrA = ptrA.next;
                ptrB = ptrB.next;
            }
        }

        return true;
    }
}
