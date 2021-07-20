package x2021.z07;

import util.ListNode;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-20 09:30
 **/
public class y20反转一个单链表递归 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;node2.next = node3;node3.next = node4;node4.next = node5;
        ListNode node = reverseList(node1);
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode newHead =reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
