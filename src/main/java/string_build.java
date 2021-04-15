

// 虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。
// 为了能高效拼接字符串，Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象：

// public class string_build {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder(1024);
//         for (int i = 0; i < 1000; i++) {
//             sb.append(',');
//             sb.append(i);
//         }
//         String s = sb.toString();
//         System.out.println();
//     }
// }


// StringBuilder还可以进行链式操作：
//  链式操作
// public class Main {
//     public static void main(String[] args) {
//         var sb = new StringBuilder(1024);
//         sb.append("Mr ")
//                 .append("Bob")
//                 .append("!")
//                 .insert(0, "Hello, ");
//         System.out.println(sb.toString());
//     }
// }

import java.util.StringJoiner;

public class string_build {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}
