public class OddEvenList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode tmpPtr = new ListNode(2);
        head.next = tmpPtr;

        tmpPtr.next = new ListNode(3);
        tmpPtr = tmpPtr.next;

        tmpPtr.next = new ListNode(4);
        tmpPtr = tmpPtr.next;

        tmpPtr.next = new ListNode(5);
        tmpPtr = tmpPtr.next;

        tmpPtr.next = null;

        Solution_22 s22 = new Solution_22();
        s22.oddEvenList(head);

        System.out.println(1);

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
class Solution_22 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        int count = 1;
        ListNode tail = head;
        while (tail.next != null){
            tail = tail.next;
            count++;
        }

        ListNode ptrA = head;
        ListNode ptrB = head.next;

        for(int i = 2; i <= count; ++i){
             if(i % 2 == 0){
                    ptrA.next = ptrB.next;
                    ptrB.next = null;
                    tail.next = ptrB;
                    tail = tail.next;

                    ptrB = ptrA.next;
             }if(i % 2 == 1){
                 ptrA = ptrA.next;
                 ptrB = ptrB.next;
            }
        }

        return head;
    }
}