package x2021.z07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: Algorithm
 * @description: 1893 检查是否区域内所有证书都被覆盖
 * @author: 谢泽毅
 * @create: 2021-07-23 09:56
 **/
public class y23检查是否区域内所有证书都被覆盖暴力 {
//    给你一个二维整数数组 ranges 和两个整数 left 和 right 。每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的 闭区间 。
//
//    如果闭区间 [left, right] 内每个整数都被 ranges 中 至少一个 区间覆盖，那么请你返回 true ，否则返回 false 。
//
//    已知区间 ranges[i] = [starti, endi] ，如果整数 x 满足 starti <= x <= endi ，那么我们称整数x 被覆盖了。

    //限制条件
//    1 <= ranges.length <= 50
//    1 <= starti <= endi <= 50
//    1 <= left <= right <= 50
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,3},{1,3},{1,3}};
        boolean covered = isCovered(ints, 1, 4);
        System.out.println(covered);
    }
    public static boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] flags = new boolean[51];
        for(int[] range:ranges){
            //暴力
            //for(int i = range[0]; i <= range[1];i++){
            //    flags[i] = true;
            //}
            Arrays.fill(flags,range[0],range[1]+1,true);
        }
        for(int i=left;i<=right;++i){
            if(flags[i] == false)
                return false;
        }
        return true;
    }

}
