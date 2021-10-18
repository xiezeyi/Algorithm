package x2021.z10;

import com.sun.javafx.logging.JFRInputEvent;

public class y18补码 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        long ans=1;
        while(ans<=num){ans*=2;}
        return (int)ans-1-num;
    }
}
