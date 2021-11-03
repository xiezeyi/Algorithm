package x2021.sortAlgorithm;

/**
 * <p>标题: 02选择排序</p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/11/3
 */
public class Selection_Sort {
    public static void sort(int arr[]){
        for( int i = 0;i < arr.length ; i++ ){
            int min = i;//最小元素的下标
            for(int j = i + 1;j < arr.length ; j++ ){
                if(arr[j] < arr[min]){
                    min = j;//找最小值
                }
            }
            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
