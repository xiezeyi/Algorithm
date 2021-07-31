package x2021.z07;

/**
 * @program: Algorithm
 * @description: 171 excel表序列号
 * @author: 谢泽毅
 * @create: 2021-07-30 08:36
 **/
public class y30excel表序列号 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }


    public static int titleToNumber(String columnTitle) {
        int res = 0;
        char[] chars = columnTitle.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            res += Math.pow(26,chars.length-1-i)*(chars[i]-64);
        }
        return res;
    }
}
