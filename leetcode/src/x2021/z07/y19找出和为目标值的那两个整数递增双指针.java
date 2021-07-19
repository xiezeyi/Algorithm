package x2021.z07;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 10:20
 **/
public class y19找出和为目标值的那两个整数递增双指针 {
    //输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
    //关注点 递增排序
    public static void main(String[] args) {
        int[] positivetwoSum = positivegetTwoSum(new int[]{2,7,11,15}, 9);
        System.out.println(positivetwoSum[0]);
    }

    static int[] positivegetTwoSum(int[] nums,int target){
        int i = 0,j=nums.length-1;
        while (i<j){
            int s = nums[i]+nums[j];
            if(s<target){
                i++;
            }else if (s>target){
                j--;
            }else {
                return new int[] {nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
