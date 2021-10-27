package x2021.z10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>标题: 删除无效的括号</p>
 * <p>描述: 给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。返回所有可能的结果。答案可以按 任意顺序 返回。</p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/10/27
 */
public class y27删除无效的括号 {
    public static void main(String[] args) {
        String s = "()";
        y27删除无效的括号 y27删除无效的括号 = new y27删除无效的括号();
        for (String s1 : y27删除无效的括号.removeInvalidParentheses(s)) {
            System.out.println(s1);
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        char[] chars = s.toCharArray();
        Set<String> res = new HashSet<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if ('(' == chars[i] || ')' == chars[i]){
                String newS = removeCharAt(s, i);
                char[] chars1 = newS.toCharArray();
                count = 0;
                for (char c : chars1) {
                    if (count<0){
                        break;
                    }
                    if ('(' == c){
                        count++;
                    }else if (')' == c){
                        count--;
                    }
                }
                if (count == 0){
                    res.add(String.valueOf(chars1));
                }
            }
        }
        if (count == 0){
            res.add(s);
        }
        if (res.size() == 0 ){
            res.add("");
        }
        return new ArrayList<>(res);
    }
    public String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
