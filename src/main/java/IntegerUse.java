public class IntegerUse {

    public static void main(String[] args) {

        //  在 Java 8 中，Integer 缓存池的大小默认为 -128~127。
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);    // false
        Integer z = 123;
        Integer k = 123;
        System.out.println(z == k);   // true
        Integer m = 323;
        Integer n = 323;
        System.out.println(m == n); // false


    }
}
