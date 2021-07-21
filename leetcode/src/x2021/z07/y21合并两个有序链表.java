package x2021.z07;

import util.ListNode;

/**
 * @program: Algorithm
 * @description: 21
 * @author: 谢泽毅
 * @create: 2021-07-21 14:15
 **/
public class y21合并两个有序链表 {
    //2.合并两个有序链表
    //将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node3;

        node2.next = node4;
        node4.next = node5;

        ListNode node = twoListAdd(node1,node2);
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static ListNode twoListAdd(ListNode head1,ListNode head2) {
        if (head1 == null||head2 == null) {
            return head1!=null?head1:head2;
        }
        ListNode head = head1.data<head2.data?head1:head2;
        ListNode cur1 = head==head1?head1:head2;
        ListNode cur2 = head==head1?head2:head1;
        ListNode pre=null;
        ListNode next=null;
        while(cur1!=null&&cur2!=null){
            if(cur1.data<=cur2.data){
                pre=cur1;
                cur1=cur1.next;
            }else{
                next=cur2.next;
                pre.next=cur2;
                cur2.next=cur1;
                pre=cur2;
                cur2=next;
            }
        }
        pre.next=cur1==null?cur2:cur1;
        return head;
    }
}
