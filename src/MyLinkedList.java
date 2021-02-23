public class MyLinkedList {
    MyListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new MyListNode(0);
        head.next = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= 0 && index < head.val){
            MyListNode ptr = head;
            for(int i = -1; i < index; ++i){
                ptr = ptr.next;
            }
            return ptr.val;
        }else
            return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyListNode tmpNode = new MyListNode(val);
        tmpNode.next = head.next;
        head.next = tmpNode;

        head.val++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyListNode ptr = head;
        while (ptr.next != null){
            ptr = ptr.next;
        }

        MyListNode tmpNode = new MyListNode(val);
        tmpNode.next = null;
        ptr.next = tmpNode;

        head.val++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0){
            addAtHead(val);
        }
        else if(index > head.val)
            ;
        else if (index == head.val){
            addAtTail(val);
        }
        else {
            MyListNode ptr = head;
            for (int i = -1; i < index-1; ++i){
                ptr = ptr.next;
            }

            MyListNode tmpNode = new MyListNode(val);
            tmpNode.next = ptr.next;
            ptr.next = tmpNode;

            head.val++;
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >=0 && index < head.val){
            MyListNode ptr = head;
            for (int i = -1; i < index-1; i++){
                ptr = ptr.next;
            }
            ptr.next = ptr.next.next;

            head.val--;
        }else
            return;
    }

    public static void main(String[] args) {
//        ["MyLinkedList","addAtHead","addAtIndex","get","addAtHead","addAtTail","get","addAtTail","get","addAtHead","get","addAtHead"]
//        [[],[5],[1,2],[1],[6],[2],[3],[1],[5],[2],[2],[6]]
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(5);
        linkedList.addAtIndex(1,2);
        linkedList.get(1);
        linkedList.addAtHead(6);
        linkedList.addAtTail(2);
        linkedList.get(3);
        linkedList.addAtTail(1);
        linkedList.get(5);
        linkedList.addAtHead(2);
        linkedList.get(2);
        linkedList.addAtHead(6);


//        linkedList.addAtHead(1);
//        linkedList.addAtTail(3);
//        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
//        linkedList.get(1);            //返回2
//        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
//        linkedList.get(1);

    }
}

class MyListNode{
    int val;
    MyListNode next;

    public MyListNode(int val){
        this.val = val;
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */