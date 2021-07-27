package x2021.z07;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Algorithm
 * @description: 671
 * @author: 谢泽毅
 * @create: 2021-07-27 08:45
 **/
public class y27二叉树第二小的节点 {
//    给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为2或0。如果一个节点
//    有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
//
//    更正式地说，root.val = min(root.left.val, root.right.val) 总成立。
//
//    给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。

    public static void main(String[] args) {
        y27TreeNode root = new y27TreeNode(2);
        root.left = new y27TreeNode(2);
        root.right = new y27TreeNode(5);
        root.right.left = new y27TreeNode(5);
        root.right.right = new y27TreeNode(7);

        System.out.println(findSecondMinimumValue(root));
        return;
    }
    public static int findSecondMinimumValue(y27TreeNode root) {
        Queue<y27TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int min = root.val, ans = Integer.MAX_VALUE;
        boolean ansf = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                y27TreeNode node = queue.poll();
                if (node.val > min && node.val <= ans) {
                    ans = node.val;
                    ansf = true;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return ansf ? ans : -1;

    }
}
