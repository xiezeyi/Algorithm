package x2021.z07;

import util.ListNode;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-20 10:25
 **/
public class y20反转一个单链表 {
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
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null) {
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }
}
