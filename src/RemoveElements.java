public class RemoveElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        addAtTail(head, 1);
        addAtTail(head, 2);
        addAtTail(head, 6);
        addAtTail(head, 3);
        addAtTail(head, 4);
        addAtTail(head, 5);
        addAtTail(head, 6);

        Solution_21 s21 = new Solution_21();
        s21.removeElements(head, 6);
        System.out.println("lifan");
    }

    static void addAtTail(ListNode head, int val){
        if(head == null){
            head = new ListNode(val);
        }else {
            ListNode ptr = head;
            while (ptr.next != null){
                ptr = ptr.next;
            }

            ptr.next = new ListNode(val);
        }
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
class Solution_21 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null){
            if(head.val == val)
                head = head.next;
            else
                break;
        }

        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        else {
            ListNode p = head, q = p.next;
            while (q.next != null){
                if(q.val == val){
                    p.next = q.next;
                    q = p.next;
                }else {
                    p = p.next;
                    q = q.next;
                }
            }
            if(q.val == val)
                p.next = q.next;

            return head;
        }
    }
}
