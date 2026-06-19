
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode curr=null;
        int a=0,b=0;
        while (l1!=null) {
            a=a*10+l1.val;
            l1=l1.next;
        }
        while (l2!=null) {
            b=b*10+l2.val;
            l2=l2.next;
        }
        int c=a+b;
        if (c==0) {
            return new ListNode(0);
        }
        while (c!=0) {
            int digit=c%10;
            ListNode newN = new ListNode(digit);
            if (head==null) {
                head=newN;
                curr=head;
            } else {
                curr.next=newN;
                curr=curr.next;
            }
            System.out.println(digit);
            c/=10;
        }
        return head;
    }
    public static String to_String(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
            sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        if (len==1) {
            return null;
        }
        if (len==2&&n==2) {
            head=head.next;
            return head;
        }
        temp=head;
        for (int i = 0; i < len-n-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=head;
        while(temp!=null) {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(removeNthFromEnd(head,2));
    }
}
