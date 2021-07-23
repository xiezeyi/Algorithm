package x2021.z07;

/**
 *  1736替换隐藏数字
 * @author 谢泽毅
 * @data 2021/7/24 7:47
 */
public class y24替换隐藏数字 {
    public static void main(String[] args) {

    }
    public static String maximumTime(String time){
        char[] arr =time.toCharArray();
        if(arr[0] == '?'){
            if(arr[1]<='9'&&arr[1]>='4'){
                arr[0]='1';
            }else {
                arr[0]='2';
            }
        }
        if(arr[1] == '?'){
            if(arr[0] == '2'){
                arr[1] = '3';
            }else {
                arr[1] = '9';
            }
        }
        if(arr[3] == '?'){
            arr[3] = '5';
        }
        if(arr[4] == '?'){
            arr[4] = '9';
        }
        return new String(arr);
    }
}
