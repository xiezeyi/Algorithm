package x2021.z09;

public class y28比较含退格的字符串 {
    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    public static String build(String str){
        StringBuffer res = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != '#'){
                res.append(ch);
            }else {
                if (res.length() > 0){
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }
}
