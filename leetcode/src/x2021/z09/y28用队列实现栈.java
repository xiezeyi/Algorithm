package x2021.z09;

import java.util.LinkedList;
import java.util.Queue;

public class y28用队列实现栈 {
    public static void main(String[] args) {
        y28用队列实现栈 obj = new y28用队列实现栈();
        obj.push(3);
        obj.push(4);
        int param_2 = obj.pop();
        System.out.println("param_2 = " + param_2);
        int param_3 = obj.top();
        System.out.println("param_3 = " + param_3);
        boolean param_4 = obj.empty();
        System.out.println("param_4 = " + param_4);
    }
    //用队列实现栈
//（标签:栈，设计）
//使用队列实现栈的下列操作：
//push(x) -- 元素 x 入栈
//pop() -- 移除栈顶元素
//top() -- 获取栈顶元素
//empty() -- 返回栈是否为空
//注意:
//你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
//你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
//你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
    //1.创建两个队列
    //2.入栈要将新的值放在队列2，再将队列1的所有旧值加在队列2后，将两个队列互换位置，得到最终的队列q1
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;
    public void push(int x) {
        q2.add(x);
        top = x;
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }
    //3.移除队列第一个数，返回移除的数,更新栈顶元素
    public int pop() {
        q1.remove();
        int r = top;
        if (!q1.isEmpty()) {
            top = q1.peek();
        }
        return r;
    }
    //判断是否为空
    public boolean empty() {
        return q1.isEmpty();
    }
    //返回栈顶元素
    public int top() {
        return top;
    }
}
