package x2021.z11;

/**
 * <p>标题: 有效的完全平方数 </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2021</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @author: xiezeyi
 * @date 2021/11/4
 */
public class y04有效的完全平方数 {
    public static void main(String[] args) {
        boolean perfectSquare = isPerfectSquare(16);
        System.out.println(perfectSquare);

    }
    public static boolean isPerfectSquare(int num) {
        for (int i = 1; num > 0; num -= i, i += 2) ;
        return num == 0;
    }
}
