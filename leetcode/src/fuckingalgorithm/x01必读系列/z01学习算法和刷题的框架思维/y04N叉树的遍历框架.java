package fuckingalgorithm.x01必读系列.z01学习算法和刷题的框架思维;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-26 11:51
 **/
public class y04N叉树的遍历框架 {
/*
    */
/* 基本的 N 叉树节点 *//*

    class TreeNode {
        int val;
        TreeNode[] children;
    }

    void traverse(TreeNode root) {
        for (TreeNode child : root.children)
            traverse(child);
    }
*/
}
