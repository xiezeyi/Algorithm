package x2021.z10;

import java.util.HashMap;
import java.util.Map;

public class y11整数转换英文表示 {

    public static void main(String[] args) {
        int num = 1234567891;
        System.out.println(numberToWords(num));
        return;
    }
    private static Map<Integer,String> numToEnglistMap = new HashMap();
    static {
        numToEnglistMap.put(0,"Zero");
        numToEnglistMap.put(1, "One");
        numToEnglistMap.put(2, "Two");
        numToEnglistMap.put(3, "Three");
        numToEnglistMap.put(4, "Four");
        numToEnglistMap.put(5, "Five");
        numToEnglistMap.put(6, "Six");
        numToEnglistMap.put(7, "Seven");
        numToEnglistMap.put(8, "Eight");
        numToEnglistMap.put(9, "Nine");
        numToEnglistMap.put(10, "Ten");
        numToEnglistMap.put(11, "Eleven");
        numToEnglistMap.put(12, "Twelve");
        numToEnglistMap.put(13, "Thirteen");
        numToEnglistMap.put(14, "Fourteen");
        numToEnglistMap.put(15, "Fifteen");
        numToEnglistMap.put(16, "Sixteen");
        numToEnglistMap.put(17, "Seventeen");
        numToEnglistMap.put(18, "Eighteen");
        numToEnglistMap.put(19, "Nineteen");

        numToEnglistMap.put(20, "Twenty");
        numToEnglistMap.put(30, "Thirty");
        numToEnglistMap.put(40, "Forty");
        numToEnglistMap.put(50, "Fifty");
        numToEnglistMap.put(60, "Sixty");
        numToEnglistMap.put(70, "Seventy");
        numToEnglistMap.put(80, "Eighty");
        numToEnglistMap.put(90, "Ninety");

        numToEnglistMap.put(100, "Hundred");
        numToEnglistMap.put(1000, "Thousand");
        numToEnglistMap.put(1000000, "Million");
        numToEnglistMap.put(1000000000, "Billion");
    }

    //    数字范围  0-2147483648
    //    输入：num = 1234567891
    //    输出："One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"

    public static String numberToWords(int num) {
        int mValue = num;

        if (mValue == 0) {
            return numToEnglistMap.get(0);
        }
        StringBuffer sb = new StringBuffer();

        // Billion
        if (mValue >= 1000000000) {
            wrapBelowThousand((int) mValue / 1000000000,sb);
            sb.append(" ").append(numToEnglistMap.get(1000000000));
            mValue = mValue % 1000000000;
        }
        // Million
        if (mValue >= 1000000) {
            wrapBelowThousand((int) mValue / 1000000,sb);
            sb.append(" ").append(numToEnglistMap.get(1000000));
            mValue = mValue % 1000000;
        }

        // Thousand
        if (mValue >= 1000) {
            wrapBelowThousand((int) mValue / 1000,sb);
            sb.append(" ").append(numToEnglistMap.get(1000));
            mValue = mValue % 1000;
        }
        wrapBelowThousand(mValue,sb);
        return sb.toString();
    }

    private static StringBuffer wrapBelowThousand(int num, StringBuffer sb) {

        int mValue = num;

        if (mValue >= 100) {
            int hNum = mValue / 100;
            if(sb.length()>0) sb.append(" ");
            sb.append(numToEnglistMap.get(hNum)).append(" ").append(numToEnglistMap.get(100));
            mValue = mValue % 100;
        }


        if (mValue < 20) {
            if ((mValue == 0 && sb.length() == 0) || mValue > 0) {
                if(sb.length()>0) sb.append(" ");
                sb.append(numToEnglistMap.get(mValue));
            }
        } else if (20 <= mValue) {
            int x10 = mValue / 10;
            if(sb.length()>0) sb.append(" ");
            sb.append(numToEnglistMap.get(x10 * 10));
            int m10 = mValue % 10;
            if (m10 > 0) {
                sb.append(" ").append(numToEnglistMap.get(m10));
            }
        }
        return sb;
    }


}
