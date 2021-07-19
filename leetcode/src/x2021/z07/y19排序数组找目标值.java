package x2021.z07;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 09:05
 **/
public class y19排序数组找目标值 {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //你可以假设数组中无重复元素。
    public static void main(String[] args) {
        int down = removenum(new int[]{1,3,5,6},0);
        System.out.println(down);
    }
    public static int removenum(int arr[],int val){
        int down=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<val){
                down++;
            }
        }
        return down;
    }
}
