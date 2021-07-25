package x2021.z07;

import util.ListNode;

/**
 * @author 谢泽毅
 * @data 2021/7/25 8:35
 */
public class y25输出链表倒数节点 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode re=getpartlist(node1,3);
        for(int i=0;i<3;i++){
            System.out.println(re.data);
            re=re.next;
        }
    }
    public static ListNode getpartlist(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
