package x2021.z11;

/**
 * <p>标题: </p>
 * <p>描述:
 * xabcbas
 * n个 奇数长度的回文串中心点
 *
 * xabbas
 * n-1个 偶数长度的回文串中心点
 * </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/11/10
 */
public class y10最长回文字符串优化 {
    public static void main(String[] args) {
        y10最长回文字符串优化 y10最长回文字符串优化 = new y10最长回文字符串优化();
        String abcsdabccba = y10最长回文字符串优化.longestPallindrome("abccba");
        System.out.println(abcsdabccba);
    }
    public String longestPallindrome(String s) {
        if (s == null) {
            return null;
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String add = getPallindrome(s, i, i);
            if (longest.length() < add.length()) {
                longest = add;
            }

            String even = getPallindrome(s, i, i + 1);
            if (longest.length() < even.length()) {
                longest = even;
            }

        }
        return longest;
    }

    private String getPallindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
