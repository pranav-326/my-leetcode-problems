
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head, tempc = head;
        while (tempc != null && tempc.next != null) {
            temp = temp.next;
            tempc = tempc.next.next;
        }
        return temp;
    }

    public ListNode reverseList(ListNode head) {//for the diagram visit https://youtu.be/G0_I-ZF0S38?t=118
        ListNode curr = head, prev = null, temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode out = new ListNode(0), dum = out, p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                dum.next = p1;
                p1 = p1.next;
            } else {
                dum.next = p2;
                p2 = p2.next;
            }
            dum = dum.next;
        }
        if (p1 != null) {
            dum.next = p1;
        }
        if (p2 != null) {
            dum.next = p2;
        }
        return out.next;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (f==s) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(deleteDuplicates(head));
    }
}
