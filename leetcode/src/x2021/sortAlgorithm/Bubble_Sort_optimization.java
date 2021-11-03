package x2021.sortAlgorithm;

/**
 * <p>标题: 01冒泡排序</p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/11/3
 */
public class Bubble_Sort_optimization {
    public static void sort(int arr[]){
        for( int i = 0;i < arr.length - 1 ; i++ ){
            boolean isSort = true;
            for( int j = 0;j < arr.length - 1 - i ; j++ ){
                int temp = 0;
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
    }

    /**
     * 优化的冒泡排序
     * @param arr
     */
    public static void sort2(int arr[]){
        for( int i = 0;i < arr.length - 1 ; i++ ){
            boolean isSort = true;
            for( int j = 0;j < arr.length - 1 - i ; j++ ){
                int temp = 0;
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
    }
}
