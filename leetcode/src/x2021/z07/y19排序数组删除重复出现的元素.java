package x2021.z07;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 08:32
 **/
public class y19排序数组删除重复出现的元素 {
    //给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

    //不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
    public static void main(String[] args) {
        int newlength = dellike(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(newlength);
    }
    public static int dellike(int arr[]){
        int down=0;
        for (int i=1;i<arr.length;i++){
            if(arr[down]!=arr[i]){
                down++;
                arr[down]=arr[i];
            }
        }
//        for (int i=0;i<=down;i++){
//            System.out.println(arr[i]);
//        }
        return down+1;
    }
}
