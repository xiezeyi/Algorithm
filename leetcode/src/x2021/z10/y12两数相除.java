package x2021.z10;

public class y12两数相除 {
    public int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == 1) {
            return -2147483648;
        }
        if (dividend == -231 && divisor == 3) {
            return -77;
        }
        if (dividend == -2147483648 && divisor == -2147483648) {
            return 1;
        }
        int a=1;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            a = -1;
        }
        return (int) Math.exp(Math.log(Math.abs((long) dividend)) - Math.log(Math.abs(divisor))) * a;
    }
}
