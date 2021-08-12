package x2021.z08;

/**
 * @program: Algorithm
 * @description: 516最长回文子序列
 * @author: 谢泽毅
 * @create: 2021-08-12 19:11
 **/
//dp[i][j]：字符串s在[i, j]范围内最长的回文子序列的长度为dp[i][j]
//如果s[i]与s[j]相同，那么dp[i][j] = dp[i + 1][j - 1] + 2
//如果s[i]与s[j]不相同，dp[i][j] = max(dp[i + 1][j], dp[i][j - 1])
//dp数组初始化：dp[i][i]即主对角线肯定都是1，其他全为0即可
//dp[i][j]依赖dp[i + 1][j - 1]、所以需要从下往上、从左往右遍历
public class y12最长回文子序列 {
    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i+1; j < s.length(); j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 2 + dp[i+1][j-1] : Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][s.length()-1];
    }
}
