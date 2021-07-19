package x2021.z07;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 09:50
 **/
public class y19找出和为目标值的那两个整数哈希表比差值 {
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。

    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    //你可以按任意顺序返回答案。
    public static void main(String[] args) {
        int[] twoSum = getTwoSum(new int[]{2,7,11,15}, 9);
        System.out.println(twoSum[0]+" "+twoSum[1]);
    }
    static int[] getTwoSum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        //添加新值判断新值能否找到旧值
        for (int i=0;i<nums.length;i++){
            int oldkey=target-nums[i];
            if(map.containsKey(oldkey)){
                return new int[] {nums[map.get(oldkey)],nums[i]};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException();
    }
}
