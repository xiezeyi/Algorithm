package x2021.z11;

/**
 * <p>标题: 最长回文字符串-优化O(n^3->n^2)</p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/11/10
 */
public class y10最长回文字符串 {
    public static void main(String[] args) {
        y10最长回文字符串 y10最长回文字符串 = new y10最长回文字符串();
        System.out.println(y10最长回文字符串.longestPalindrome("aaabba"));
    }
    public String longestPalindrome(String s){
        if (s == null) {
            return null;
        }

        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start + length <= s.length(); start++) {
                if (isPalindrome(s, start, start + length - 1)) {
                    return s.substring(start,start+length);
                }
            }
            
        }

        return "";
    }

    private boolean isPalindrome(String s,int left,int right){
        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}
