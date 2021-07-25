package x2021.z07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 谢泽毅
 * @data 2021/7/25 8:31
 */
public class y25g从相邻元素对还原数组 {
    public int[] restoreArray(int[][] adjacentPairs){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int first = 0;
        for (int[] pair : adjacentPairs) {
            if (map.containsKey(pair[0])) {
                map.get(pair[0]).add(pair[1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(pair[1]);
                map.put(pair[0], list);
            }
            if (map.containsKey(pair[1])) {
                map.get(pair[1]).add(pair[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(pair[0]);
                map.put(pair[1], list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                first = entry.getKey();
                break;
            }
        }
        int[] res = new int[adjacentPairs.length + 1];
        res[0] = first;
        for (int i = 1; i < res.length; i++) {
            List<Integer> list = map.get(res[i - 1]);
            if (list.size() == 2) {
                if (list.get(0) != res[i - 2]) {
                    res[i] = list.get(0);
                } else {
                    res[i] = list.get(1);
                }
            } else {
                res[i] = list.get(0);
            }
        }
        return res;
    }
}
