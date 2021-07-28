package x2021.z07;


import util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Algorithm
 * @description: 863 二叉树中所有距离为k的节点
 * @author: 谢泽毅
 * @create: 2021-07-28 17:49
 **/
//给定一个二叉树（具有根结点root），一个目标结点target，和一个整数值 K 。
//
//        返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。

public class y28g二叉树中所有距离为k的节点 {
    static Map<Integer, TreeNode> parents = new HashMap<Integer, TreeNode>();
    static List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 从 root 出发 DFS，记录每个结点的父结点
        findParents(root);

        // 从 target 出发 DFS，寻找所有深度为 k 的结点
        findAns(target, null, 0, k);

        return ans;
    }

    public static void findParents(TreeNode node) {
        if (node.left != null) {
            parents.put(node.left.val, node);
            findParents(node.left);
        }
        if (node.right != null) {
            parents.put(node.right.val, node);
            findParents(node.right);
        }
    }

    public static void findAns(TreeNode node, TreeNode from, int depth, int k) {
        if (node == null) {
            return;
        }
        if (depth == k) {
            ans.add(node.val);
            return;
        }
        if (node.left != from) {
            findAns(node.left, node, depth + 1, k);
        }
        if (node.right != from) {
            findAns(node.right, node, depth + 1, k);
        }
        if (parents.get(node.val) != from) {
            findAns(parents.get(node.val), node, depth + 1, k);
        }
    }



}
