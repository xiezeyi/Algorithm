package x2021.z07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Algorithm
 * @description: 1104 二叉树寻路
 * @author: 谢泽毅
 * @create: 2021-07-29 09:48
 **/
public class y29二叉树寻路 {
    public static void main(String[] args) {
        System.out.println(pathInZigZagTree(26));
        return;

    }
    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();
        while(label != 1){
            list.add(label);
            //1110 ^ 111  = 1001   >>1  得到100
            label = (label ^ ((
                    1<< (int)(Math.floor(Math.log(label) / Math.log(2.0))))-1)
                    )>>1;
        }
        list.add(1);
        Collections.reverse(list);
        return list;
    }
}
