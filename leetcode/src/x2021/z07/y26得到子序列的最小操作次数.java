package x2021.z07;

import java.util.*;

/**
 * @program: Algorithm
 * @description:　1713得到子序列的最小操作次数
 * @author: 谢泽毅
 * @create: 2021-07-26 09:32
 **/
public class y26得到子序列的最小操作次数 {
    //给你一个数组 target ，包含若干 互不相同 的整数，以及另一个整数数组 arr ，arr 可能 包含重复元素。
    //
    //每一次操作中，你可以在 arr 的任意位置插入任一整数。比方说，如果 arr = [1,4,1,2] ，那么你可以在中间添加 3 得到 [1,4,3,1,2] 。你可以在数组最开始或最后面添加整数。
    //
    //请你返回 最少 操作次数，使得 target 成为 arr 的一个子序列。
    //
    //一个数组的 子序列 指的是删除原数组的某些元素（可能一个元素都不删除），同时不改变其余元素的相对顺序得到的数组。比方说，[2,7,4] 是 [4,2,3,7,2,1,4] 的子序列（加粗元素），但 [2,4,2] 不是子序列。
    public static void main(String[] args) {
        int[] target = {6, 4, 8, 1, 3, 2};
        int[] arr = {4,7,6,2,3,8,6,1};
        System.out.println(minOperations(target, arr));
    }
    public static int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            targetMap.put(target[i],i);
        }
        int[] array = new int[arr.length];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(targetMap.containsKey(arr[i])){
                array[n++]= targetMap.get(arr[i]);
            }
        }
        int[] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        int longCount = lengthOfLIS(newArray,newArray.length);
        return target.length-longCount;
    }
    public static int lengthOfLIS(int[] nums,int n){
        if (n==0) {
            return 0;
        }
        int res = 1;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int num:nums){
            int i = 0,j = res;
            while(i < j){
                int mid = (i + j)>>1;
                if(dp[mid] >= num) {
                    j = mid;
                } else i = mid + 1;
            }
            dp[i] = num;
            if(j == res) res++;
        }
        return res;
    }
}
