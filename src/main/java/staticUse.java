public class staticUse {
    private int x;         // 实例变量
    private static int y;  // 静态变量
    public static void func1(){
        // 只能访问所属类的静态字段和静态方法，方法中不能有 this 和 super 关键字。
        System.out.println("static func");
    }

    static {
        System.out.println("静态语句块在类初始化时运行一次。");
    }
    public static void main(String[] args) {
        // int x = A.x;  // Non-static field 'x' cannot be referenced from a static context
        staticUse a = new staticUse();staticUse b = new staticUse();

        staticUse.func1();
//        staticUse.main(new String[]{"a"});

        int x = a.x;
        int y = staticUse.y;
    }



}
