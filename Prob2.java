public class Prob2 {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        if (l2 == null) return l1;
        if (l1 == null) return l2;

        int sum = 0;

        ListNode head = new ListNode(-1);
        ListNode pointer = head;


        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            pointer.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            pointer = pointer.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;
            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            pointer.next = new ListNode(sum);
            l1 = l1.next;
            pointer = pointer.next;
        }

        while (l2 != null) {
            sum = l2.val + carry;
            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }
            pointer.next = new ListNode(sum);
            l2 = l2.next;
            pointer = pointer.next;
        }

        if (carry == 1) {
            pointer.next = new ListNode(1);
            pointer = pointer.next;
        }

        return head.next;
    }
}
