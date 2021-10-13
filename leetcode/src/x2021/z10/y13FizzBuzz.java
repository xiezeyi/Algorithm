package x2021.z10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//412
public class y13FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if (i%3==0 && i%5==0){
                res.add("FizzBuzz");
            }else if (i%3==0){
                res.add("Fizz");
            }else if (i%5==0){
                res.add("Buzz");
            }else{
                res.add(""+i);
            }
        }
        return res;

    }

    public static List<String> fizzBuzz2(int n) {
        return IntStream.range(1, n + 1).mapToObj(a -> a % 15 == 0 ? "FizzBuzz" : a % 3 == 0 ? "Fizz" : a % 5 == 0 ? "Buzz" : String.valueOf(a)).collect(Collectors.toList());
    }
}
