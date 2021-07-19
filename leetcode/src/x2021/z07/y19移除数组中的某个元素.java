package x2021.z07;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 09:23
 **/
public class y19移除数组中的某个元素 {
    //  给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。

    //  不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
//  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    public static void main(String[] args) {
        int newlength = removenum(new int[]{0,1,2,2,3,0,4,2},2);
        System.out.println(newlength);
    }
    public static int removenum(int arr[],int val){
        int down=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[down]=arr[i];
                down++;
            }
        }
//        for (int i=0;i<down;i++){
//            System.out.println(arr[i]);
//        }
        return down;
    }
}
