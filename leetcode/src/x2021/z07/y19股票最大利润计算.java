package x2021.z07;

/**
 * @program: Algorithm
 * @description:
 * @author: 谢泽毅
 * @create: 2021-07-19 09:48
 **/
public class y19股票最大利润计算 {
    //给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    //如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
    //注意：你不能在买入股票前卖出股票。
    public static void main(String[] args) {
        int down = MaxMoney(new int[]{2,5,3,1,9,2,11});
        System.out.println(down);
    }
    public static int MaxMoney(int arr[]){
        //记录一个最低值后记录一个最高值,bottom改变记录值且保存当前利润
        int money=0;

        int bottom=arr[0];
        int top=arr[0];
        for (int i=1;i<arr.length;i++){
            if(top<arr[i]){
                top=arr[i];
            }
            if(bottom>arr[i]){
                if(money<top-bottom){
                    money=top-bottom;
                }
                top=0;
                bottom=arr[i];
            }
        }
        if(money<top-bottom){
            money=top-bottom;
        }
        return money;
    }
}
