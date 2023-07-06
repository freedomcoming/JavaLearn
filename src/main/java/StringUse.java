public class StringUse {
    public static void main(String[] args) {

        /* 使用 String.intern() 可以保证相同内容的字符串变量引用同一的内存对象。下面示例中，
        s1 和 s2 采用 new String() 的方式新建了两个不同对象，而 s3 是通过 s1.intern() 方法取得一个对象引用。intern() 首先把 s1 引用的对象放到 String Pool(字符串常量池)中，然后返回这个对象引用。因此 s3 和 s1 引用的是同一个字符串常量池的对象。 */
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        System.out.println(s1.intern() == s3);  // true

        //   如果是采用 "bbb" 这种使用双引号的形式创建字符串实例，会自动地将新建的对象放入 String Pool 中。
        String s4 = "bbb";
        String s5 = "bbb";
        System.out.println(s4 == s5);  // true

    }
}


// string 不可变 线程安全