package x2021.z10;

import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>标题: 路径总和 II 113</p>
 * <p>描述:
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/10/26
 */
public class y26路径总和2 {
    public static void main(String[] args) {
        y26路径总和2 test = new y26路径总和2();
        y26TreeNode root = new y26TreeNode(2);
        root.left = new y26TreeNode(2);
        root.right = new y26TreeNode(5);
        root.right.left = new y26TreeNode(5);
        root.right.right = new y26TreeNode(7);

        List<List<Integer>> lists = test.pathSum(root, 12);

        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
            System.out.println(";");
        }

        return;
    }
    List<List<Integer>> ret = new LinkedList<>();
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(y26TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ret;
    }

    void dfs(y26TreeNode root, int targetSum){
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        targetSum = targetSum - root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();

    }
}
