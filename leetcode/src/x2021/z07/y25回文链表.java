package x2021.z07;

import util.ListNode;

/**
 * @author 谢泽毅
 * @data 2021/7/25 8:16
 */
public class y25回文链表 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(isPalindrome(node1));
        Object object = new Object();
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode quick = head;
        ListNode slow = head;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        ListNode pre = null;
        ListNode p = slow;
        while (p != null) {
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        while (pre != null) {
            if (pre.data == head.data) {
                pre = pre.next;
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
