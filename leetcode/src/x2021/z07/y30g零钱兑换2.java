package x2021.z07;

/**
 * @program: Algorithm
 * @description: 518零钱兑换 II
 * @author: 谢泽毅
 * @create: 2021-07-30 08:59
 **/
public class y30g零钱兑换2 {
    public static void main(String[] args) {
        System.out.println(change(5,new int[]{1,2,5}));
    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
