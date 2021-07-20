package x2021.z07;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: leetcode1877
 * @author: 谢泽毅
 * @create: 2021-07-20 08:51
 **/
public class y20数组中最大数对和的最小值贪心排序 {

    public static void main(String[] args) {
        System.out.println(minPairSum(new int[] {4,1,5,1,2,5,1,5,5,4}));
        //1112445555
    }
    //1.选出最小数值对
    public static int minPairSum(int[] nums) {
        int res = 0,n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length/2; i++) {
            res = Math.max(res , nums[i]+nums[--n]);
        }
        return res;
    }
}
