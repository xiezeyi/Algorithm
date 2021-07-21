package x2021.z07;
import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-21 16:01
 **/
public class y21判断链表中是否有环 {
    //给定一个链表，判断链表中是否有环。
    //如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数pos来表示链表尾连接到链表中的位置（索引从0开始）。 如果pos是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
    //如果链表中存在环，则返回 true。否则，返回false 。
    //进阶：
    //你能用 O(1)（即，常量）内存解决此问题吗？
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next=node2;
        System.out.println(haso(node1));
    }
    public static boolean  haso(ListNode head){
        Set<ListNode> listNode=new HashSet<>();
        while (head != null){
            if (listNode.contains(head)){
                System.out.println(head.data);
                return true;
            }else {
                listNode.add(head);
            }
            head=head.next;
        }
        return false;
    }


}
