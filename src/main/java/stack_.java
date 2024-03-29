import java.util.Stack;

public class stack_ {
    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<Integer>();
        System.out.println(sk.isEmpty());//判断栈是否为空，true
        for (int i = 0; i < 10; i++) {
            int e = sk.push(i + 20);//将元素加入栈顶，并返回栈顶元素
           System.out.println(i + ":  " + e);
        }
        System.out.println(sk.empty());//判断栈是否为空，false
        System.out.println(sk.pop());//返回栈顶元素，并删除
        System.out.println(sk.peek());//返回当前栈顶元素

        System.out.println(sk);

        System.out.println("first:" + sk.search(20));//查找栈中元素的位置
        sk.add(1);
        sk.push(2);
        System.out.println(sk);
        System.out.println(sk.search(2)); // 2是1 第一个位置
        System.out.println("last:" + sk.search(29));
    }
}